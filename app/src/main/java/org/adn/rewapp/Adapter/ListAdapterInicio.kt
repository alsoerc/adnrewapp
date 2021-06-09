package org.adn.rewapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Model.Event
import org.adn.rewapp.R

class ListAdapterInicio (private val events : List <Event>): RecyclerView.Adapter<ListAdapterInicio.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_inicio, parent , false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return events.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val event = events[position]
        holder.bind(event)
    }


    class ViewHolder(view : View): RecyclerView.ViewHolder(view) {

        private val icon = view.findViewById<ImageView>(R.id.icon)
        private val description = view.findViewById<TextView>(R.id.title)
        private val title = view.findViewById<TextView>(R.id.description)

        fun bind(event: Event) {
            //icon = event.icon
            description.text = event.description
            title.text = event.title
        }
    }

}


