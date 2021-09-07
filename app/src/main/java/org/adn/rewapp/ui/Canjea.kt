package org.adn.rewapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Adapter.ListAdapterCanjear
import org.adn.rewapp.Model.Canjear
import org.adn.rewapp.R
import java.util.*


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

        var elements : ArrayList<Canjear> = ArrayList()

        elements.add(Canjear("","asereje", "no", 20))
        elements.add(Canjear("","taquitos", "no", 20))
        elements.add(Canjear("","aahhh", "no", 20))
        elements.add(Canjear("","tacos", "no", 20))
        elements.add(Canjear("","tacos", "no", 20))


        recyclerView.adapter= ListAdapterCanjear(elements) { element ->
            Toast.makeText(context, "elección : ${element.itemName}" , Toast.LENGTH_SHORT).show();
        };


        return view
    }

    companion object {
        fun newInstance() : Canjea = Canjea()
    }
}
