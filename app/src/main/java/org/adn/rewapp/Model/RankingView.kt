package org.adn.rewapp.Model

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import org.adn.rewapp.R

class RankingView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private var rankingPosition : TextView
    private var totalPoints : TextView

    init{
        val view = LayoutInflater
            .from(context)
            .inflate(R.layout.list_ranking, this, true)

        rankingPosition = view.findViewById(R.id.ranking_position)
        totalPoints = view.findViewById(R.id.total_points)
    }

    fun setRanking(ranking : Ranking){
        rankingPosition.text = ranking.rankingPosition
        totalPoints.text = ranking.totalPoints.toString()
    }
}