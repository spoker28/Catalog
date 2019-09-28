package com.example.library

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.library.presentation.InstitutionsList.InstitutionsFragment

class Places : AppCompatActivity() {

    companion object TAGS{
        const val INSTITUTION_LIST_FRAGMENT= "INSTITUTION_LIST_FRAGMENT"
        const val HOME_FRAGMENT="HOME_FRAGMENT"
        const val MAP_FRAGMENT="MAP_FRAGMENT"
        const val RECOMENDATION_FRAGMENT="RECOMENDATION_FRAGMENT"
        const val COMPARISON_FRAGMENT="COMPARISON_FRAGMENT"
    }
    private var fragmentList:List<Fragment> = listOf(InstitutionsFragment())
    private var selectedFragment=0

    private lateinit var textMessage: TextView
    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        val transaction =supportFragmentManager.beginTransaction()
        when (item.itemId) {
            R.id.navigation_map-> {
                if (selectedFragment != 0) {
//                    transaction.show(fragmentList[1])
                    textMessage.setText(R.string.title_home)
                    return@OnNavigationItemSelectedListener true
                }
            }
            R.id.navigation_discount -> {
                textMessage.setText(R.string.title_dashboard)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_recomendation -> {
                textMessage.setText(R.string.title_notifications)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_settings -> {

            }
        }
        transaction.commit()
        true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_places)
        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction()
                .add(R.id.container,fragmentList[0], INSTITUTION_LIST_FRAGMENT)
                .show(fragmentList[0])
                .commit()
            selectedFragment=0
        }
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        textMessage = findViewById(R.id.message)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }
}
