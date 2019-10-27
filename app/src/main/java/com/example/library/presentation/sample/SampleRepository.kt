package com.example.library.presentation.sample

import com.example.library.entities.AsyncResult
import com.example.library.entities.Sample
import com.example.library.entities.Table
import com.example.library.extensions.getData
import com.example.library.extensions.postData
import com.google.firebase.database.DatabaseReference

class SampleRepository(private val firebase: DatabaseReference) {

    fun postSample(sampleObject: Sample) {
        firebase.postData(Table.SAMPLE, sampleObject)
    }

    suspend fun getSamples(): AsyncResult<List<Sample>> {
        return firebase.getData(Table.SAMPLE)// здесь будет вместо sample переменная которую мы будем передавать для опознания таблицы в firebase
    }
}


