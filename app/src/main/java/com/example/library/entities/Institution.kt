package com.example.library.entities

import java.io.Serializable
import java.time.DayOfWeek
import java.util.*

data class Institution (val title:String,val rating:Float,val description:String,val pictureUrls: List<String>? = null, val characteristicList:ArrayList<Characteristic>,val dateList:ArrayList<Calendar>):Serializable

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
fun timeConvert(time:Calendar):String {
    var hour = time.get(Calendar.HOUR_OF_DAY).toString()
    var minute=time.get(Calendar.MINUTE).toString()
    return "$hour:$minute"
}



