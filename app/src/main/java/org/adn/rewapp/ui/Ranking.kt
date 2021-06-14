package org.adn.rewapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Adapter.ListAdapterRanking
import org.adn.rewapp.Model.RankingDetalle
import org.adn.rewapp.R
import org.adn.rewapp.detalle_ranking


class Ranking : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ranking, container, false)



        // Inflate the layout for this fragment
        return view
    }

    companion object {
        fun newInstance() : Ranking = Ranking()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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

        val btnRankingDetail = view.findViewById<LinearLayout>(R.id.ranking_position)
        btnRankingDetail.setOnClickListener { view ->

            //Reemplazar el contenido del nav_host con otro fragment
            val fragment = detalle_ranking()
            val fr = activity?.supportFragmentManager
            val fragmenT = fr!!.beginTransaction()
            fragmenT.replace(R.id.nav_host_fragment, fragment)
            fragmenT.addToBackStack(null)
            fragmenT.commit()

        }

    }


}
