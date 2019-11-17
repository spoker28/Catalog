package com.example.library.entities

class ComparisonList(){
    private var comparisonList:ArrayList<Institution>?=null


    fun setComparisonList(comparisonList: ArrayList<Institution>){
        this.comparisonList=comparisonList
    }
    fun getComparisonList():ArrayList<Institution>? {
        return this.comparisonList
    }


}