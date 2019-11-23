package com.example.library.presentation.institutionsList

import androidx.lifecycle.MutableLiveData
import com.example.library.base.BaseViewModel
import com.example.library.data.remote.ApiInteractor
import com.example.library.data.remote.CoroutineCaller
import com.example.library.entities.Characteristic
import com.example.library.entities.Institution
import com.example.library.presentation.institution.InstitutionRepository
import java.time.DayOfWeek
import java.util.*
import kotlin.collections.ArrayList

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
                    ),characteristicList = arrayListOf(
                        Characteristic("Цена","100"),
                        Characteristic("sad","sad"),
                        Characteristic("sad","sad"),
                        Characteristic("sad","sad"),
                        Characteristic("sad","sad")

                    ),dateList = arrayListOf(
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 1)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 1)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 2)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 2)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 3)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 3)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 4)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 4)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 5)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 5)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 6)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 6)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 7)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 7)
                            set(Calendar.HOUR_OF_DAY,18)
                            set(Calendar.MINUTE, 0)
                        }
                    )

                        )


                )
            add(
                Institution(
                    "Bazunga",3.5f,"Еда Умпа-Лумпы ыофр волфыв рлоыфлр влыфрлврфло",
                    pictureUrls = arrayListOf(
                        "http://rest-barnaul.ru/uploads/images/1/about.jpg",
                        "https://media-cdn.tripadvisor.com/media/photo-s/0b/ed/85/50/caption.jpg"

                    ),characteristicList = arrayListOf(
                        Characteristic("Цена","1000"),
                        Characteristic("sad","sasd"),
                        Characteristic("sad","sad"),
                        Characteristic("sad","saad"),
                        Characteristic("sad","asad")

                    ),dateList = arrayListOf(
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 1)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 1)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 2)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 2)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 3)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 3)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 4)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 4)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 5)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 5)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 6)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 6)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 7)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 7)
                            set(Calendar.HOUR_OF_DAY,18)
                            set(Calendar.MINUTE, 0)
                        }
                    ))

            )
            add(
                Institution(
                    "Bazunga",3.5f,"Еда Умпа-Лумпы ыофр волфыв рлоыфлр влыфрлврфло",
                    pictureUrls = arrayListOf(
                        "http://rest-barnaul.ru/uploads/images/1/about.jpg"

                    ),characteristicList = arrayListOf(
                        Characteristic("Цена","200"),
                        Characteristic("sad","sasad"),
                        Characteristic("sad","sadd"),
                        Characteristic("sad","sadas"),
                        Characteristic("sad","sasd")

                    ),dateList = arrayListOf(
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 1)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 1)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 2)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 2)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 3)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 3)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 4)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 4)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 5)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 5)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 6)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 6)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 7)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 7)
                            set(Calendar.HOUR_OF_DAY,18)
                            set(Calendar.MINUTE, 0)
                        }
                    ))

            )
            add(
                Institution(
                    "Bazunga",3.5f,"Еда Умпа-Лумпы ыофр волфыв рлоыфлр влыфрлврфло",
                    pictureUrls = arrayListOf(
                        "http://rest-barnaul.ru/uploads/images/1/about.jpg"

                    ),characteristicList = arrayListOf(
                        Characteristic("Цена","300"),
                        Characteristic("sad","sad"),
                        Characteristic("sad","sad"),
                        Characteristic("sad","sad"),
                        Characteristic("sad","sad")

                    ),dateList = arrayListOf(
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 1)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 1)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 2)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 2)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 3)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 3)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 4)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 4)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 5)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 5)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 6)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 6)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 7)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 7)
                            set(Calendar.HOUR_OF_DAY,18)
                            set(Calendar.MINUTE, 0)
                        }
                    ))

            )
            add(
                Institution(
                    "Bazunga",3.5f,"Еда Умпа-Лумпы ыофр волфыв рлоыфлр влыфрлврфло",
                    pictureUrls = arrayListOf(
                        "http://rest-barnaul.ru/uploads/images/1/about.jpg"

                    ),characteristicList = arrayListOf(
                        Characteristic("Цена","100"),
                        Characteristic("sad","sad"),
                        Characteristic("sad","sad"),
                        Characteristic("sad","sad"),
                        Characteristic("sad","sad")

                    ),dateList = arrayListOf(
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 1)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 1)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 2)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 2)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 3)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 3)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 4)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 4)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 5)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 5)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 6)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 6)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 7)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 7)
                            set(Calendar.HOUR_OF_DAY,18)
                            set(Calendar.MINUTE, 0)
                        }
                    ))

            )
            add(
                Institution(
                    "Bazunga",3.5f,"Еда Умпа-Лумпы ыофр волфыв рлоыфлр влыфрлврфло",
                    pictureUrls = arrayListOf(
                        "http://rest-barnaul.ru/uploads/images/1/about.jpg"

                    ),characteristicList = arrayListOf(
                        Characteristic("Цена","100"),
                        Characteristic("sad","sad"),
                        Characteristic("sad","sad"),
                        Characteristic("sad","sad"),
                        Characteristic("sad","sad")

                    ),dateList = arrayListOf(
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 1)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 1)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 2)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 2)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 3)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 3)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 4)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 4)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 5)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 5)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 6)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 6)
                            set(Calendar.HOUR_OF_DAY,22)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 7)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 0)
                        },
                        GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 7)
                            set(Calendar.HOUR_OF_DAY,18)
                            set(Calendar.MINUTE, 0)
                        }
                    ))

            )




            institutionLiveData.value= list
        }


    }
}









































































