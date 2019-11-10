package com.example.library.presentation.institutionsList

import com.example.library.entities.AsyncResult
import com.example.library.entities.Institution
import com.example.library.entities.Table
import com.example.library.extensions.getData
import com.google.firebase.database.DatabaseReference

class InstitutionListRepository (private val firebase: DatabaseReference){

    suspend fun getInstitutions(): AsyncResult<List<Institution>> {
        return firebase.getData(Table.InstitutionList)
    }
}
