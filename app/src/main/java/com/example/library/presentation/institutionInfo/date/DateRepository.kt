package com.example.library.presentation.institutionInfo.date

import com.example.library.entities.AsyncResult
import com.example.library.entities.Table
import com.example.library.extensions.getData
import com.google.firebase.database.DatabaseReference
import java.util.*

class DateRepository(private val firebase:DatabaseReference){
    suspend fun getDate(): AsyncResult<List<Date>> {
        return firebase.getData(Table.DATE)

    }


}