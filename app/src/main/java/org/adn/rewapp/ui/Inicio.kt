package org.adn.rewapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_inicio.*
import org.adn.rewapp.Adapter.ListAdapterInicio
import org.adn.rewapp.Model.Event

import org.adn.rewapp.R

class Inicio : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_inicio, container, false)


        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter =ListAdapterInicio(listOf(
            Event("uno", "dos"),
            Event("uno", "dos"),
            Event("uno", "dos"),
            Event("uno", "dos"),
            Event("uno", "dos"),
            Event("uno", "dos"),
            Event("uno", "dos")
        ))


        return view

    }

    companion object {
        fun newInstance() : Inicio = Inicio()
    }


}
