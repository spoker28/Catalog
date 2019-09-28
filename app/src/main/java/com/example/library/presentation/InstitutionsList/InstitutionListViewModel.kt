package com.example.library.presentation.InstitutionsList

import android.view.inputmethod.CorrectionInfo
import androidx.lifecycle.MutableLiveData
import com.example.library.base.BaseViewModel
import com.example.library.data.remote.ApiInteractor
import com.example.library.data.remote.CoroutineCaller
import com.example.library.entities.Institution
import com.example.library.presentation.Institution.InstitutionRepository
import com.google.android.gms.common.api.Api

class InstitutionListViewModel(private val repository: InstitutionRepository): BaseViewModel(), CoroutineCaller by ApiInteractor(){
    var institutionLiveData = MutableLiveData<List<Institution>>()

    fun getInstitutions(){
        val list= ArrayList<Institution>()
        list.apply {
            add(
                Institution(
                    "Bazunga",3.5f,"Еда Умпа-Лумпы ыофр волфыв рлоыфлр влыфрлврфло")

                )
            add(
                Institution(
                    "Bazunga",3.5f,"Еда Умпа-Лумпы ыофр волфыв рлоыфлр влыфрлврфло")

            )




            institutionLiveData.value= list
        }


    }
}









































































