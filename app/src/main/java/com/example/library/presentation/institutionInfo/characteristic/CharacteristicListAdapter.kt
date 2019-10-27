package com.example.library.presentation.institutionInfo.characteristic

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.library.R
import com.example.library.entities.Characteristic
import com.example.library.presentation.institutionInfo.InstitutionDetailFragment
import kotlinx.android.synthetic.main.item_characteristics.view.*


class CharacteristicListAdapter(): RecyclerView.Adapter<CharacteristicListAdapter.characteristicViewHolder>() {
    var fragment : InstitutionDetailFragment? = null
    var characteristicList = ArrayList<Characteristic>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): characteristicViewHolder {
        return characteristicViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_characteristics, parent, false))
    }

    override fun getItemCount(): Int= characteristicList.size

    override fun onBindViewHolder(holder: characteristicViewHolder, position: Int) {
        holder.bindView(characteristicList[position])
    }
    fun setDataset(list:List<Characteristic>){
        characteristicList.clear()
        characteristicList.addAll(list)
    }


    inner class characteristicViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        fun bindView(item: Characteristic) = with(view) {
            characteristicname.text = item.characteristicname
            characteristic.text = item.characteristic
        }

    }
}