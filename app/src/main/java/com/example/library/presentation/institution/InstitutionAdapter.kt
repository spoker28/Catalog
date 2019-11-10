package com.example.library.presentation.institution

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.library.R
import com.example.library.entities.CategoryItem
import kotlinx.android.synthetic.main.item_institution.view.*

class InstitutionAdapter : RecyclerView.Adapter<InstitutionAdapter.InstitutionViewHolder>() {

    private var dataSet = ArrayList<CategoryItem>()
    private var listener: InstitutionAdapter.InstitutionListener? = null

    fun setDataSet(list: ArrayList<CategoryItem>){
        dataSet = list
        this.notifyDataSetChanged()
    }

    fun getDataSetSize() = dataSet.size

    fun setListener(link: InstitutionAdapter.InstitutionListener){
        listener = link
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstitutionViewHolder {
        return InstitutionViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_institution, parent, false))
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: InstitutionViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }


    inner class InstitutionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: CategoryItem){
            itemView.button.setImageResource(item.resid)
            itemView.titlebutton.text=item.title
        }
        init{
            itemView.button.setOnClickListener{
                listener?.onClick(dataSet[adapterPosition])
            }
        }
    }


    interface InstitutionListener{
        fun onClick(item: CategoryItem)

    }
}