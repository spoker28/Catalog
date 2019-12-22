package com.example.library.presentation.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.library.R
import com.example.library.entities.ComparisonList
import com.example.library.presentation.comparison.ComparisonFragment
import com.example.library.presentation.institutionsList.InstitutionsFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {
    companion object TAGS {
        const val INSTITUTION_LIST_FRAGMENT = "INSTITUTION_LIST_FRAGMENT"
        const val MAP_FRAGMENT = "MAP_FRAGMENT"
        const val DISCOUNT_FRAGMENT= "DISCOUNT_FRAGMENT"
        const val RECOMENDATION_FRAGMENT = "RECOMENDATION_FRAGMENT"
        const val COMPARISON_FRAGMENT = "COMPARISON_FRAGMENT"
    }

    private var listFragment: List<Fragment> =
        listOf(InstitutionsFragment(),InstitutionsFragment(),InstitutionsFragment(),InstitutionsFragment(),InstitutionsFragment(),ComparisonFragment())
    private var selectedFragment = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.container, listFragment[0], INSTITUTION_LIST_FRAGMENT)
                .add(R.id.container, listFragment[1], MAP_FRAGMENT)
                .add(R.id.container, listFragment[2], DISCOUNT_FRAGMENT)
                .add(R.id.container, listFragment[3], RECOMENDATION_FRAGMENT)
                .add(R.id.container, listFragment[4], COMPARISON_FRAGMENT)
                .show(listFragment[0])
                .hide(listFragment[1])
                .hide(listFragment[2])
                .hide(listFragment[3])
                .hide(listFragment[4])
                .commit()
            selectedFragment = 0
        }
        nav_view.setOnNavigationItemSelectedListener {
            val transaction = supportFragmentManager.beginTransaction()
            when(it.itemId){
                R.id.navigation_map -> {
                    if (selectedFragment != 1) {
                        transaction.show(listFragment[1]).hide(listFragment[selectedFragment])
                        selectedFragment = 1
                    }
                }
                R.id.navigation_discount -> {
                    if (selectedFragment != 2) {
                        transaction.show(listFragment[2]).hide(listFragment[selectedFragment])
                        selectedFragment = 2
                    }

                }
                R.id.navigation_recomendation -> {
                    if (selectedFragment != 3) {
                        transaction.show(listFragment[3]).hide(listFragment[selectedFragment])
                        selectedFragment = 3
                    }

                }
                else -> {
                            transaction.show(listFragment[0]).hide(listFragment[selectedFragment])
                        selectedFragment = 0

                }
            }
            transaction.commit()
            true

            }


        }
    }