package com.example.library.presentation.institutionInfo.characteristic

import androidx.lifecycle.MutableLiveData
import com.example.library.base.BaseViewModel
import com.example.library.entities.Characteristic
import com.example.library.entities.Institution

class CharacteristicViewModel(private val repository: CharacteristicRepository) : BaseViewModel(){
    val characteristicListLiveData = MutableLiveData<ArrayList<Characteristic>>()

    fun getCharacteristic(institution:Institution){
        characteristicListLiveData.value=institution.characteristicList
    }

}