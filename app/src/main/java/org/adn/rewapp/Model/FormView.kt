package org.adn.rewapp.Model

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import org.adn.rewapp.R

class FormView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private var name : TextView
    private var value : TextView

    init {
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.list_gana, this, true)

        name = view.findViewById(R.id.form_name)
        value = view.findViewById(R.id.form_value)
    }

    fun setForm(form: Form){
        name.text = form.formName
        value.text = form.formValue
    }


}