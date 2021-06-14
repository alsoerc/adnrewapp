package org.adn.rewapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Adapter.ListAdapterRankingDetalle
import org.adn.rewapp.Model.RankingDetalle

class detalle_ranking : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_detalle_ranking, container, false)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view_ranking_detalle)
        recyclerView.adapter = ListAdapterRankingDetalle(listOf(
            RankingDetalle("Ana Luz te compartió 5W", "02/noviembre/2020", 20000),
            RankingDetalle("Ana Luz te compartió 5W", "02/noviembre/2020", 20000),
            RankingDetalle("Ana Luz te compartió 5W", "02/noviembre/2020", 20000),
            RankingDetalle("Ana Luz te compartió 5W", "02/noviembre/2020", 20000),
            RankingDetalle("Ana Luz te compartió 5W", "02/noviembre/2020", 20000),
            RankingDetalle("Ana Luz te compartió 5W", "02/noviembre/2020", 20000),
            RankingDetalle("Ana Luz te compartió 5W", "02/noviembre/2020", 20000)
        ))

        return view
    }

}