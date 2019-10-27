package com.example.library.presentation.institutionInfo.characteristic

import com.example.library.entities.AsyncResult
import com.example.library.entities.Characteristic
import com.example.library.entities.Table
import com.example.library.extensions.getData
import com.google.firebase.database.DatabaseReference

class CharacteristicRepository(private val firebase: DatabaseReference){
    suspend fun getCharacteristic():AsyncResult<List<Characteristic>>{
        return firebase.getData(Table.CHARACTERISTIC)

    }
}