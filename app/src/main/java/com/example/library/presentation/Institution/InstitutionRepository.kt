package com.example.library.presentation.Institution

import com.example.library.entities.AsyncResult
import com.example.library.entities.CategoryItem
import com.example.library.entities.Table
import com.example.library.extensions.getData
import com.example.library.extensions.postData
import com.google.firebase.database.DatabaseReference

class InstitutionRepository(private val firebase: DatabaseReference) {

    fun postPlace(placeObject: CategoryItem) {
        firebase.postData(Table.SAMPLE, placeObject)
    }

    suspend fun getInstitutions(): AsyncResult<List<CategoryItem>> {
        return firebase.getData(Table.SAMPLE)
    }
}