package org.adn.rewapp.Model

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import org.adn.rewapp.R

class EventView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    //private var icon : ImageView
    private var description : TextView
    private var title : TextView

    init {
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.list_inicio, this, true)

      //  icon = view.findViewById(R.id.icon)
        description = view.findViewById(R.id.title)
        title = view.findViewById(R.id.description)
    }

    fun setEvent(event: Event){
        //icon = event.icon
        description.text = event.description
        title.text = event.title
    }

}