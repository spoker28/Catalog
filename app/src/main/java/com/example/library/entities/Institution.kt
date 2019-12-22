package com.example.library.entities

import java.io.Serializable
import java.time.DayOfWeek
import java.util.*

data class Institution (val title:String,val rating:Float,val description:String,val pictureUrls: List<String>? = null, val characteristicList:ArrayList<Characteristic>,val dateList:ArrayList<Schedule>):Serializable

fun dayConvert(date: Calendar):String {
    var day = when (date.get(Calendar.DAY_OF_WEEK)) {
        1 -> "Понедельник"
        2 -> "Вторник"
        3 -> "Среда"
        4 -> "Четверг"
        5 -> "Пятница"
        6 -> "Суббота"
        else -> "Воскресенье"
    }
    return day
}
fun smalltimeConvert(time:String):String{
    var newtime=time
    if(time.toLong()>=0 && time.toLong()<=9)
        newtime="0$time"
    return newtime
}
fun timeConvert(time:Schedule):String {
    var hourbegining = smalltimeConvert(time.begining.get(Calendar.HOUR_OF_DAY).toString())
    var minutebegining= smalltimeConvert(time.begining.get(Calendar.MINUTE).toString())
    var hourending = smalltimeConvert(time.ending.get(Calendar.HOUR_OF_DAY).toString())
    var minuteending= smalltimeConvert(time.ending.get(Calendar.MINUTE).toString())
    return "$hourbegining:$minutebegining - $hourending:$minuteending"
}



