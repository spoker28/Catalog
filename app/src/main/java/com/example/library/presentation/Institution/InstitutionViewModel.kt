package com.example.library.presentation.Institution

import androidx.lifecycle.MutableLiveData
import com.example.library.R
import com.example.library.base.BaseViewModel
import com.example.library.entities.CategoryItem
import com.example.library.entities.CategoryType

class InstitutionViewModel(private val repository: InstitutionRepository) : BaseViewModel() {

    val institutionListLiveData = MutableLiveData<ArrayList<CategoryItem>>()

    fun postInstitution(placeObject: CategoryItem) {
        repository.postPlace(placeObject)
    }

    fun getInstitutions(){
//        makeRequest({repository.getPlaces()}){ res->
//            unwrap(res){
//                placeListLiveData.value = it as ArrayList<CategoryItem>
//            }
//        }
        val list = arrayListOf<CategoryItem>().apply {
            add(CategoryItem(CategoryType.Restaraunt, R.drawable.ic_restaurant_black_24dp/* int */,"Ресторан"))
            add(CategoryItem(CategoryType.Bar, R.drawable.ic_local_bar_black_24dp/* int */,"Бар"))
            add(CategoryItem(CategoryType.Restaraunt, R.drawable.ic_restaurant_black_24dp/* int */,"Ресторан"))
            add(CategoryItem(CategoryType.Restaraunt, R.drawable.ic_restaurant_black_24dp/* int */,"Ресторан"))
            add(CategoryItem(CategoryType.Restaraunt, R.drawable.ic_restaurant_black_24dp/* int */,"Ресторан"))
            add(CategoryItem(CategoryType.Restaraunt, R.drawable.ic_restaurant_black_24dp/* int */,"Ресторан"))
            add(CategoryItem(CategoryType.Restaraunt, R.drawable.ic_restaurant_black_24dp/* int */,"Ресторан"))
            add(CategoryItem(CategoryType.Restaraunt, R.drawable.ic_restaurant_black_24dp/* int */,"Ресторан"))


        }
        institutionListLiveData.value = list


    }
}