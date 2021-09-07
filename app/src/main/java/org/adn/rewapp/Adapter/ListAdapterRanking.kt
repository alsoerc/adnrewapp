package org.adn.rewapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Model.Ranking
import org.adn.rewapp.R

class ListAdapterRanking(private val rankings : List<Ranking>, private val listener: (Ranking) -> Unit) : RecyclerView.Adapter<ListAdapterRanking.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_ranking, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = rankings.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ranking = rankings[position]
        holder.itemView.setOnClickListener{listener(ranking)}
        holder.bind(ranking)
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        private val rankingPosition = view.findViewById<TextView>(R.id.ranking_position)
        private val totalPoints = view.findViewById<TextView>(R.id.total_points)

        fun bind(ranking: Ranking){
            rankingPosition.text = ranking.rankingPosition
            totalPoints.text = ranking.totalPoints.toString()
        }
    }

}