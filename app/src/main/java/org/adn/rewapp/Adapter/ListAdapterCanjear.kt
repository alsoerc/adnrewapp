package org.adn.rewapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.adn.rewapp.Model.Canjear
import org.adn.rewapp.R


class ListAdapterCanjear(private val canjeos : List<Canjear>, private val listener: (Canjear) -> Unit) :
    RecyclerView.Adapter<ListAdapterCanjear.ViewHolder>() /*, View.OnClickListener*/ {

    //var listener  : View.OnClickListener? = null;
    //private val mOnClickListener: View.OnClickListener = MyOnClickListener()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.list_canjear, parent, false)
        //view.setOnClickListener(this)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val canjeo = canjeos[position]
        holder.cv.animation = AnimationUtils.loadAnimation(holder.itemView.context, R.anim.fade_transition)

        //val anim: Animation = AnimationUtils.loadAnimation( , R.anim.fade_transition)

        holder.itemView.setOnClickListener{listener(canjeo)}

        holder.bind(canjeo)
    }

    override fun getItemCount(): Int = canjeos.size

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){

        val itemName = view.findViewById<TextView>(R.id.txt_canjea_nombre)
        val itemRestriction = view.findViewById<TextView>(R.id.txt_canjea_restriccion)
        val itemPrice = view.findViewById<TextView>(R.id.txt_canjea_precio)
        val cv = view.findViewById<LinearLayout>(R.id.cv)


        fun bind(canjear: Canjear){
            itemName.text = canjear.itemName
            itemRestriction.text = canjear.itemRestriction
            itemPrice.text = canjear.itemPrice.toString()

        }

    }

  /*  fun setOnclickListener(listener : View.OnClickListener){
        this.listener = listener;
    }

    override fun onClick(v: View?) {
        listener?.onClick(v)
    } */


}