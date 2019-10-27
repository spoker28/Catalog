package com.example.library.presentation.institutionInfo.date

import androidx.lifecycle.MutableLiveData
import com.example.library.base.BaseViewModel
import com.example.library.entities.Date

class DateViewModel(private val repository: DateRepository):BaseViewModel(){
    var dateListLiveData = MutableLiveData<ArrayList<Date>>()

    fun getDate(){
//        makeRequest({repository.getDate()}){ res->
//            unwrap(res){
//                placeListLiveData.value = it as ArrayList<Date>
//            }
//        }
        val list = arrayListOf<Date>().apply {
            add(Date("Понедельник","10:00-18:00"))
            add(Date("Вторник","10:00-18:00"))
            add(Date("Среда","10:00-18:00"))
            add(Date("Четверг","10:00-18:00"))
            add(Date("Пятница","10:00-18:00"))
            add(Date("Суббота","12:00-18:00"))
            add(Date("Воскресенье","Выходной"))



        }
        dateListLiveData.value=list

    }



}