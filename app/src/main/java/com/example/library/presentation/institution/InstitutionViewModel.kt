package com.example.library.presentation.institution

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
            add(CategoryItem(CategoryType.Educationalcenter, R.drawable.ic_book_black_24dp/* int */,"Школа"))
            add(CategoryItem(CategoryType.Hotel, R.drawable.ic_hotel_black_24dp/* int */,"Отель"))
            add(CategoryItem(CategoryType.Barbershop, R.drawable.ic_content_cut_black_24dp/* int */,"Салон красоты"))
            add(CategoryItem(CategoryType.Carwashing, R.drawable.ic_directions_car_black_24dp/* int */,"Автомойка"))
            add(CategoryItem(CategoryType.Hospital, R.drawable.ic_add_black_24dp/* int */,"Больница"))
            add(CategoryItem(CategoryType.Shop, R.drawable.ic_shopping_cart_black_24dp/* int */,"Магазин"))
            add(CategoryItem(CategoryType.Bank, R.drawable.ic_monetization_on_black_24dp/* int */,"Банк"))


        }
        institutionListLiveData.value = list


    }
}