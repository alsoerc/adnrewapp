package org.adn.rewapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Model.RankingDetalle
import org.adn.rewapp.R

class ListAdapterRankingDetalle (private val details : List<RankingDetalle>) : RecyclerView.Adapter<ListAdapterRankingDetalle.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_ranking_detalle, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val detail = details[position]
        holder.bind(detail)
    }

    override fun getItemCount(): Int = details.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        private val wappDetail = view.findViewById<TextView>(R.id.ranking_detalle_wapps)
        private val wappDate = view.findViewById<TextView>(R.id.ranking_detalle_wapps_fecha)
        private val wappPoints = view.findViewById<TextView>(R.id.ranking_detalle_puntos)

        fun bind(detail: RankingDetalle){
            wappDetail.text = detail.wappDetail
            wappDate.text = detail.wappDate
            wappPoints.text = detail.wappPoints.toString()
        }

    }
}