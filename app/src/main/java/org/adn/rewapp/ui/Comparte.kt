package org.adn.rewapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Adapter.ListAdapterHistory
import org.adn.rewapp.Model.History

import org.adn.rewapp.R
import org.adn.rewapp.comparte_preview
import org.adn.rewapp.detalle_ranking


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

        var elements : ArrayList<History> = ArrayList()

        elements.add(History("tanto", "Hoy"))
        elements.add(History("tanto", "Hoy"))
        elements.add(History("tanto", "Hoy"))
        elements.add(History("tanto", "Hoy"))

        recyclerView.adapter = ListAdapterHistory(elements){element ->
            Toast.makeText(context, "elección : ${element.description}" , Toast.LENGTH_SHORT).show();
        }


        // Inflate the layout for this fragment
        return view
    }

    companion object {
        fun newInstance() : Comparte = Comparte()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var searcher = view.findViewById<ImageView>(R.id.search_comparte)

        searcher.setOnClickListener { view ->
            val fragment = comparte_preview()
            val fr = activity?.supportFragmentManager
            val fragmenT = fr!!.beginTransaction()
            fragmenT.replace(R.id.nav_host_fragment, fragment)
            fragmenT.addToBackStack(null)
            fragmenT.commit()
        }


    }
}
