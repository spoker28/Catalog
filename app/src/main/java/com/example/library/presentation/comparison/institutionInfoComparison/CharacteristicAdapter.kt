package com.example.library.presentation.comparison.institutionInfoComparison

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.library.R
import com.example.library.entities.Characteristic
import com.example.library.entities.Institution
import com.example.library.entities.InstitutionsCharacteristic
import kotlinx.android.synthetic.main.item_institution_characteristic.view.*

class CharacteristicAdapter :RecyclerView.Adapter<CharacteristicAdapter.CharacteristicViewHolder>(){
    private var characteristicListData = ArrayList<InstitutionsCharacteristic>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacteristicViewHolder {
        return CharacteristicViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_institution_characteristic,parent,false))

    }

    override fun getItemCount(): Int =characteristicListData.size

    override fun onBindViewHolder(holder: CharacteristicViewHolder, position: Int) {
        return holder.bindView(characteristicListData[position])
    }
    fun setDataSet(list:List<InstitutionsCharacteristic>){
        characteristicListData.clear()
        characteristicListData.addAll(list)

    }
    inner class CharacteristicViewHolder(val view: View):RecyclerView.ViewHolder(view){
        fun bindView(item:InstitutionsCharacteristic)= with(view){
            institutionname.text=item.institutioname
            characteristic.text=item.characteristicValue
        }
    }
}