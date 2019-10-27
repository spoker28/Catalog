package com.example.library.presentation.institutionInfo.characteristic

import androidx.lifecycle.MutableLiveData
import com.example.library.base.BaseViewModel
import com.example.library.entities.Characteristic

class CharacteristicViewModel(private val repository: CharacteristicRepository) : BaseViewModel(){
    val characteristicListLiveData = MutableLiveData<ArrayList<Characteristic>>()

    fun getCharacteristic(){
        val list = arrayListOf<Characteristic>().apply {
            add(Characteristic("Средний чек","1000 тг"))
            add(Characteristic("Средний чек","1000 тг"))
            add(Characteristic("Средний чек","1000 тг"))
            add(Characteristic("Средний чек","1000 тг"))
            add(Characteristic("Средний чек","1000 тг"))
            add(Characteristic("asdsad","asdsasad"))
            add(Characteristic("asdsad","asdsasad"))
            add(Characteristic("asdsad","asdsasad"))
            add(Characteristic("asdsad","asdsasad"))
            add(Characteristic("aasdsadasdfgsafhdgfsahgdfsahdffsahgdfgsahfdhgasfhgdfas","asdsasad"))
            add(Characteristic("asdsadasdsafgdfashgdasfdfagfdghafshfdhasfh","asdsamg,b mvcnehiorujfkdmscnxzchjcvnbmsnsad"))
            add(Characteristic("asdsad","asdsasadasddddddddasdasdasdsadasdas"))




        }
        characteristicListLiveData.value=list
    }

}