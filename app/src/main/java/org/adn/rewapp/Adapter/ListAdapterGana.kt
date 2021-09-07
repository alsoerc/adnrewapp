package org.adn.rewapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Model.Canjear
import org.adn.rewapp.Model.Form
import org.adn.rewapp.R

class ListAdapterGana (private val forms : List<Form>) : RecyclerView.Adapter<ListAdapterGana.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_gana, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = forms.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val form = forms[position]
        holder.bind(form)
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        private val name = view.findViewById<TextView>(R.id.form_name)
        private val value = view.findViewById<TextView>(R.id.form_value)

        fun bind(form: Form){
            name.text = form.formName
            value.text = form.formValue
        }

    }

}