package com.example.library.entities

import java.io.Serializable

object ComparisonList:Serializable{
    var comparisonList:MutableSet<Institution>?=null// возможно проблемы с null безопасностью
}