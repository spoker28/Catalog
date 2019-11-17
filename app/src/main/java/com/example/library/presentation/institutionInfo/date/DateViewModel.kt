package com.example.library.presentation.institutionInfo.date

import androidx.lifecycle.MutableLiveData
import com.example.library.base.BaseViewModel
import com.example.library.entities.Institution
import java.util.*
import kotlin.collections.ArrayList

class DateViewModel(private val repository: DateRepository):BaseViewModel(){
    var dateListLiveData = MutableLiveData<ArrayList<Calendar>>()

    fun getDate(institution: Institution){
//        makeRequest({repository.getDate()}){ res->
//            unwrap(res){
//                placeListLiveData.value = it as ArrayList<Date>
//            }
//        }
        dateListLiveData.value=institution.dateList

    }



}