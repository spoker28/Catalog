package com.example.library

import com.example.library.base.CoroutineProvider
import com.example.library.presentation.Institution.InstitutionRepository
import com.example.library.presentation.Institution.InstitutionViewModel
import com.example.library.presentation.InstitutionsList.InstitutionListRepository
import com.example.library.presentation.InstitutionsList.InstitutionListViewModel
import com.example.library.presentation.institutionInfo.characteristic.CharacteristicRepository
import com.example.library.presentation.institutionInfo.characteristic.CharacteristicViewModel
import com.example.library.presentation.institutionInfo.date.DateRepository
import com.example.library.presentation.institutionInfo.date.DateViewModel
import com.example.library.presentation.sample.SampleRepository
import com.example.library.presentation.sample.SampleViewModel
import com.google.firebase.database.FirebaseDatabase
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    factory {
        CoroutineProvider()
    }
    single {
        FirebaseDatabase.getInstance().reference
    }

    factory {
        SampleRepository(get())
    }
    factory {
        CharacteristicRepository(get())
    }

    factory {
        InstitutionRepository(get())
    }
    factory {
        InstitutionListRepository(get())
    }
    factory {
        DateRepository(get())
    }

    viewModel {
        SampleViewModel(get())
    }

    viewModel {
        InstitutionViewModel(get())
    }

    viewModel {
        InstitutionListViewModel(get())
    }
    viewModel {
        DateViewModel(get())
    }
    viewModel {
        CharacteristicViewModel(get())
    }
}

inline fun <reified T> createWebService(okHttpClient: OkHttpClient, url: String): T {
    val gson = GsonBuilder()
        .setLenient()
        .create()

    val retrofit = Retrofit.Builder()
        .baseUrl(url)
        .client(okHttpClient)
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .addConverterFactory(GsonConverterFactory.create(gson)).build()
    return retrofit.create(T::class.java)
}