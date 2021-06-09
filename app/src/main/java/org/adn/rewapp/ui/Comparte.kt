package org.adn.rewapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Adapter.ListAdapterHistory
import org.adn.rewapp.Model.History

import org.adn.rewapp.R


class Comparte : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_comparte, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewHistory)
        recyclerView.adapter = ListAdapterHistory(listOf(
            History("tanto", "Hoy"),
            History("tanto", "Hoy"),
            History("tanto", "Hoy"),
            History("tanto", "Hoy"),
            History("tanto", "Hoy"),
            History("tanto", "Hoy")
        ))

        // Inflate the layout for this fragment
        return view
    }

    companion object {
        fun newInstance() : Comparte = Comparte()
    }

}
