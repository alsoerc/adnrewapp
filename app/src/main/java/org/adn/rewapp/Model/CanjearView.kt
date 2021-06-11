package org.adn.rewapp.Model

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import org.adn.rewapp.R

class CanjearView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    //private var image : ImageView
    private var itemName : TextView
    private var itemRestriction : TextView
    private var itemPrice : TextView

    init{
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.list_canjear, this, true)

        //image = view.findViewById(R.id.img_canjear_item)
        itemName = view.findViewById(R.id.txt_canjea_nombre)
        itemRestriction = view.findViewById(R.id.txt_canjea_restriccion)
        itemPrice = view.findViewById(R.id.txt_canjea_precio)
    }

    fun setCanjear(canjear: Canjear){
        //image.(canjear.image)
        itemName.text = canjear.itemName
        itemRestriction.text = canjear.itemRestriction
        itemPrice.text = canjear.itemPrice.toString()
    }

}