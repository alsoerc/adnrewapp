package org.adn.rewapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Adapter.ListAdapterCanjear
import org.adn.rewapp.Model.Canjear

import org.adn.rewapp.R


class Canjea : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_canjea, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewCanjear)
        recyclerView.adapter = ListAdapterCanjear(listOf(
            Canjear("asd", "Orden de tacos", "", 12),
            Canjear("asd", "Orden de tacos", "*1 mes de anticipación", 12),
            Canjear("asd", "Orden de tacos", "", 12),
            Canjear("asd", "Orden de tacos", "", 12),
            Canjear("asd", "Orden de tacos", "", 12),
            Canjear("asd", "Orden de tacos", "", 12)
        ))



        return view
    }

    companion object {
        fun newInstance() : Canjea = Canjea()
    }
}
