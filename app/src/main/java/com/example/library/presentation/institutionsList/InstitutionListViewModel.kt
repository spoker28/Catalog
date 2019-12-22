package com.example.library.presentation.institutionsList

import androidx.lifecycle.MutableLiveData
import com.example.library.base.BaseViewModel
import com.example.library.data.remote.ApiInteractor
import com.example.library.data.remote.CoroutineCaller
import com.example.library.entities.Characteristic
import com.example.library.entities.Institution
import com.example.library.entities.Schedule
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
                    "Bazunga",3.5f,"Еда на все случаи жизни",
                    pictureUrls = arrayListOf(
                        "https://media-cdn.tripadvisor.com/media/photo-s/0b/ed/85/50/caption.jpg",
                        "https://media-cdn.tripadvisor.com/media/photo-s/0b/ed/85/50/caption.jpg"
                    ),characteristicList = arrayListOf(
                        Characteristic("Цена","100"),
                        Characteristic("Средний чек","2500"),
                        Characteristic("Качество питания","3"),
                        Characteristic("Летник","+"),
                        Characteristic("Самообмлуживание","-")

                    ),dateList = arrayListOf(
                        Schedule(
                        begining= GregorianCalendar().apply {
                            set(Calendar.DAY_OF_WEEK, 1)
                            set(Calendar.HOUR_OF_DAY,10)
                            set(Calendar.MINUTE, 20)
                        },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,19)
                                set(Calendar.MINUTE, 20)
                            }
                        ),
                        Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 2)
                                set(Calendar.HOUR_OF_DAY,1)
                                set(Calendar.MINUTE, 0)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,19)
                                set(Calendar.MINUTE, 9)
                            }
                        ),Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 3)
                                set(Calendar.HOUR_OF_DAY,9)
                                set(Calendar.MINUTE, 20)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,25)
                                set(Calendar.MINUTE, 61)
                            }
                        )


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
                        Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 1)
                                set(Calendar.HOUR_OF_DAY,10)
                                set(Calendar.MINUTE, 20)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,19)
                                set(Calendar.MINUTE, 20)
                            }
                        ),
                        Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 2)
                                set(Calendar.HOUR_OF_DAY,1)
                                set(Calendar.MINUTE, 0)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,19)
                                set(Calendar.MINUTE, 9)
                            }
                        ),Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 3)
                                set(Calendar.HOUR_OF_DAY,9)
                                set(Calendar.MINUTE, 20)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,23)
                                set(Calendar.MINUTE, 20)
                            }
                        )


                    )


                )
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
                        Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 1)
                                set(Calendar.HOUR_OF_DAY,10)
                                set(Calendar.MINUTE, 20)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,19)
                                set(Calendar.MINUTE, 20)
                            }
                        ),
                        Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 2)
                                set(Calendar.HOUR_OF_DAY,1)
                                set(Calendar.MINUTE, 0)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,19)
                                set(Calendar.MINUTE, 9)
                            }
                        ),Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 3)
                                set(Calendar.HOUR_OF_DAY,9)
                                set(Calendar.MINUTE, 20)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,23)
                                set(Calendar.MINUTE, 20)
                            }
                        )


                    )


                )
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
                        Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 1)
                                set(Calendar.HOUR_OF_DAY,10)
                                set(Calendar.MINUTE, 20)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,19)
                                set(Calendar.MINUTE, 20)
                            }
                        ),
                        Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 2)
                                set(Calendar.HOUR_OF_DAY,1)
                                set(Calendar.MINUTE, 0)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,19)
                                set(Calendar.MINUTE, 9)
                            }
                        ),Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 3)
                                set(Calendar.HOUR_OF_DAY,9)
                                set(Calendar.MINUTE, 20)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,23)
                                set(Calendar.MINUTE, 20)
                            }
                        )


                    )


                )
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
                        Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 1)
                                set(Calendar.HOUR_OF_DAY,10)
                                set(Calendar.MINUTE, 20)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,19)
                                set(Calendar.MINUTE, 20)
                            }
                        ),
                        Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 2)
                                set(Calendar.HOUR_OF_DAY,1)
                                set(Calendar.MINUTE, 0)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,19)
                                set(Calendar.MINUTE, 9)
                            }
                        ),Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 3)
                                set(Calendar.HOUR_OF_DAY,9)
                                set(Calendar.MINUTE, 20)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,23)
                                set(Calendar.MINUTE, 20)
                            }
                        )


                    )


                )
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
                        Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 1)
                                set(Calendar.HOUR_OF_DAY,10)
                                set(Calendar.MINUTE, 20)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,19)
                                set(Calendar.MINUTE, 20)
                            }
                        ),
                        Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 2)
                                set(Calendar.HOUR_OF_DAY,1)
                                set(Calendar.MINUTE, 0)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,19)
                                set(Calendar.MINUTE, 9)
                            }
                        ),Schedule(
                            begining= GregorianCalendar().apply {
                                set(Calendar.DAY_OF_WEEK, 3)
                                set(Calendar.HOUR_OF_DAY,9)
                                set(Calendar.MINUTE, 20)
                            },
                            ending = GregorianCalendar().apply {
                                set(Calendar.HOUR_OF_DAY,23)
                                set(Calendar.MINUTE, 20)
                            }
                        )


                    )


                )
            )





            institutionLiveData.value= list
        }


    }
}









































































