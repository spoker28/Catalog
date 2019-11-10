package com.example.library.presentation.institutionsList

import androidx.lifecycle.MutableLiveData
import com.example.library.base.BaseViewModel
import com.example.library.data.remote.ApiInteractor
import com.example.library.data.remote.CoroutineCaller
import com.example.library.entities.Institution
import com.example.library.presentation.institution.InstitutionRepository

class InstitutionListViewModel(private val repository: InstitutionRepository): BaseViewModel(), CoroutineCaller by ApiInteractor(){
    var institutionLiveData = MutableLiveData<List<Institution>>()

    fun getInstitutions(){
        val list= ArrayList<Institution>()
        list.apply {
            add(
                Institution(
                    "Bazungasavdgdsagdasdgsfaaaaaaabbbbbbbbbbbbbbb",3.5f,"Еда Умпа-Лумпы ыофр волфыв рлоыфлр влыфрлврфло",
                    pictureUrls = arrayListOf(
                        "https://media-cdn.tripadvisor.com/media/photo-s/0b/ed/85/50/caption.jpg",
                        "https://media-cdn.tripadvisor.com/media/photo-s/0b/ed/85/50/caption.jpg"
                    ))

                )
            add(
                Institution(
                    "Bazunga",3.5f,"Еда Умпа-Лумпы ыофр волфыв рлоыфлр влыфрлврфло",
                    pictureUrls = arrayListOf(
                        "http://rest-barnaul.ru/uploads/images/1/about.jpg",
                        "https://media-cdn.tripadvisor.com/media/photo-s/0b/ed/85/50/caption.jpg"

                    ))

            )
            add(
                Institution(
                    "Bazunga",3.5f,"Еда Умпа-Лумпы ыофр волфыв рлоыфлр влыфрлврфло",
                    pictureUrls = arrayListOf(
                        "http://rest-barnaul.ru/uploads/images/1/about.jpg"

                    ))

            )
            add(
                Institution(
                    "Bazunga",3.5f,"Еда Умпа-Лумпы ыофр волфыв рлоыфлр влыфрлврфло",
                    pictureUrls = arrayListOf(
                        "http://rest-barnaul.ru/uploads/images/1/about.jpg"

                    ))

            )
            add(
                Institution(
                    "Bazunga",3.5f,"Еда Умпа-Лумпы ыофр волфыв рлоыфлр влыфрлврфло",
                    pictureUrls = arrayListOf(
                        "http://rest-barnaul.ru/uploads/images/1/about.jpg"

                    ))

            )
            add(
                Institution(
                    "Bazunga",3.5f,"Еда Умпа-Лумпы ыофр волфыв рлоыфлр влыфрлврфло",
                    pictureUrls = arrayListOf(
                        "http://rest-barnaul.ru/uploads/images/1/about.jpg"

                    ))

            )




            institutionLiveData.value= list
        }


    }
}









































































