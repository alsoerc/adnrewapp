package org.adn.rewapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Model.Canjear
import org.adn.rewapp.Model.History
import org.adn.rewapp.R

class ListAdapterHistory(private val histories : List<History>,  private val listener: (History) -> Unit):RecyclerView.Adapter<ListAdapterHistory.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_historial, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = histories.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val history = histories[position]

        holder.itemView.setOnClickListener{listener(history)}

        holder.bind(history)
    }


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        private val description = view.findViewById<TextView>(R.id.history_description)
        private val date = view.findViewById<TextView>(R.id.history_date)

        fun bind(history: History){
            description.text = history.description
            date.text = history.date
        }

    }

}