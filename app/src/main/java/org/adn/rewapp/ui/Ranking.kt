package org.adn.rewapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Adapter.ListAdapterRanking


import org.adn.rewapp.R


class Ranking : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ranking, container, false)

        val recyclerView2 = view.findViewById<RecyclerView>(R.id.recyclerViewRanking)
        recyclerView2.adapter = ListAdapterRanking(listOf(
            org.adn.rewapp.Model.Ranking("4to lugar", 3),
            org.adn.rewapp.Model.Ranking("4to lugar", 3),
            org.adn.rewapp.Model.Ranking("4to lugar", 3),
            org.adn.rewapp.Model.Ranking("4to lugar", 3),
            org.adn.rewapp.Model.Ranking("4to lugar", 3),
            org.adn.rewapp.Model.Ranking("4to lugar", 3),
            org.adn.rewapp.Model.Ranking("4to lugar", 3),
            org.adn.rewapp.Model.Ranking("4to lugar", 3),
            org.adn.rewapp.Model.Ranking("4to lugar", 3)
        ))

        // Inflate the layout for this fragment
        return view
    }

    companion object {
        fun newInstance() : Ranking = Ranking()
    }

}
