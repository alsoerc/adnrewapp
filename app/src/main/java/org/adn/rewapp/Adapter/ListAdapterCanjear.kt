package org.adn.rewapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Model.Canjear
import org.adn.rewapp.Model.Form
import org.adn.rewapp.R

class ListAdapterCanjear(private val canjeos : List<Canjear>) : RecyclerView.Adapter<ListAdapterCanjear.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_canjear, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val canjeo = canjeos[position]
        holder.bind(canjeo)
    }

    override fun getItemCount(): Int = canjeos.size

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        private val itemName = view.findViewById<TextView>(R.id.txt_canjea_nombre)
        private val itemRestriction = view.findViewById<TextView>(R.id.txt_canjea_restriccion)
        private val itemPrice = view.findViewById<TextView>(R.id.txt_canjea_precio)

        fun bind(canjear: Canjear){
            itemName.text = canjear.itemName
            itemRestriction.text = canjear.itemRestriction
            itemPrice.text = canjear.itemPrice.toString()
        }

    }


}