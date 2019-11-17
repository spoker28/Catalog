package com.example.library.presentation.institutionInfo.date

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.library.R
import com.example.library.entities.dayConvert
import com.example.library.entities.timeConvert
import com.example.library.presentation.institutionInfo.InstitutionDetailFragment
import kotlinx.android.synthetic.main.item_date.view.*
import java.util.*
import kotlin.collections.ArrayList

class DateListAdapter : RecyclerView.Adapter<DateListAdapter.dateViewHolder>(){
    var fragment : InstitutionDetailFragment? = null
    var dateList = ArrayList<Calendar>()
    override fun getItemCount(): Int= dateList.size


    override fun onBindViewHolder(holder: dateViewHolder, position: Int) {
        holder.bindView(dateList[position])
    }
    override fun onCreateViewHolder(parent: ViewGroup,viewType:Int): dateViewHolder {
        return dateViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_date, parent, false))
    }
    fun setDataSet(list : List<Calendar>){
        dateList.clear()
        dateList.addAll(list)

    }


    inner class dateViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        fun bindView(item: Calendar) = with(view) {
            datename.text = dayConvert(item)
            date.text= timeConvert(item)
        }
    }
}