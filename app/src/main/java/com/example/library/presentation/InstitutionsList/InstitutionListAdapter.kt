package com.example.library.presentation.InstitutionsList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.library.R
import com.example.library.entities.Institution
import com.example.library.extensions.loadImage
import kotlinx.android.synthetic.main.item_recomendation.view.*
import java.lang.Exception

class InstitutionListAdapter : RecyclerView.Adapter<InstitutionListAdapter.InstitutionListViewHolder>(){
    var fragment : InstitutionsFragment? = null
    private var institutionsList : List<Institution> = ArrayList()
    var institutionClickListener :OnInstitutionClickListener?=null




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstitutionListAdapter.InstitutionListViewHolder {
        return InstitutionListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_recomendation,parent,false))
    }

    override fun getItemCount(): Int=institutionsList.size

    override fun onBindViewHolder(holder: InstitutionListAdapter.InstitutionListViewHolder,position: Int) {
        holder.bindView(institutionsList[position])
    }

    fun setDataSet(it : List<Institution>?){
        institutionsList = it as ArrayList<Institution>
        this.notifyDataSetChanged()

    }
    inner class InstitutionListViewHolder(val view: View) : RecyclerView.ViewHolder(view){
        fun bindView(item : Institution){
            fragment?.let{
                view.titleTextView.text=item.title
                view.description.text=item.description
                view.ratingBar.rating=item.rating
                try{
                    view.bgImage.loadImage(item.pictureUrls?.get(0) ?:"", it)
                }catch (e: Exception) {
                    view.bgImage.loadImage("", it)
                    e.printStackTrace()
                }

            }

        }init {
            view.btnInfo.setOnClickListener {
                institutionClickListener?.onClick(adapterPosition, institutionsList[adapterPosition])
            }
        }

    }

}

