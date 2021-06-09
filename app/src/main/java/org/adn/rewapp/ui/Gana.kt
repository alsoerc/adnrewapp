package org.adn.rewapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Adapter.ListAdapterGana
import org.adn.rewapp.Model.Form

import org.adn.rewapp.R


class Gana : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_gana, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewForm)

        recyclerView.adapter = ListAdapterGana(listOf(
            Form("UNO", "3"),
            Form("UNO", "3"),
            Form("UNO", "3"),
            Form("UNO", "3"),
            Form("UNO", "3"),
            Form("UNO", "3")
        ))

        // Inflate the layout for this fragment
        return view
    }

    companion object {
        fun newInstance() : Gana = Gana()

    }

}
