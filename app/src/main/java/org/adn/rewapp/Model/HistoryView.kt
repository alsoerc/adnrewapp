package org.adn.rewapp.Model

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.*
import org.adn.rewapp.R

class HistoryView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {
    private var description : TextView
    private var date : TextView

    init{
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.list_historial, this, true)

        description = view.findViewById(R.id.history_description)
        date = view.findViewById(R.id.history_date)
    }

    fun setHistory(history: History){
        description.text = history.description
        date.text = history.date
    }
}