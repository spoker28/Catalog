package com.example.library.presentation.institutionInfo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.library.R
import com.example.library.entities.Institution
import com.example.library.presentation.institutionInfo.imageTabs.ImagePagerAdapter
import kotlinx.android.synthetic.main.activity_institutions_detail.*
import com.example.library.entities.Characteristic
import com.example.library.entities.ComparisonList
import com.example.library.presentation.comparison.ComparisonFragment
import com.example.library.presentation.institutionInfo.characteristic.CharacteristicListAdapter
import com.example.library.presentation.institutionInfo.date.DateListAdapter
import kotlinx.android.synthetic.main.activity_institutions_detail.characteristics
import kotlinx.android.synthetic.main.activity_institutions_detail.dateList
import kotlinx.android.synthetic.main.activity_institutions_detail.view.*
import org.koin.androidx.viewmodel.ext.android.getViewModel
import java.util.*
import kotlin.collections.ArrayList


class InstitutionsDetailActivity : AppCompatActivity() {
    private lateinit var institution:Institution
    private var dateListAdapter= DateListAdapter()
    private var characteristicListAdapter= CharacteristicListAdapter()
//    private lateinit var

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_institutions_detail)
        institution = intent.getSerializableExtra("institution") as Institution//Принимает информацию об ивенте
        setSupportActionBar(toolbar)

        comparisonButton.setOnClickListener {
            ComparisonList.comparisonList?.add(institution)
        }

        supportActionBar?.apply {
            title = "Catalog"
            setDisplayShowHomeEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        bindPagerAdapter()
        description.text=institution.description
        insttitle.text=institution.title
        dateList.layoutManager=LinearLayoutManager(this)
        dateList.adapter=dateListAdapter
        characteristics.layoutManager=LinearLayoutManager(this)
        characteristics.adapter=characteristicListAdapter

        dateListAdapter.setDataSet(institution.dateList)
        characteristicListAdapter.setDataset(institution.characteristicList)

        toolbar.setNavigationOnClickListener { onBackPressed() }

    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.home->{
                finish()
                return true
            }
            else ->{
                return super.onOptionsItemSelected(item)
            }
        }
    }
    private fun bindPagerAdapter(){
        val imagePagerAdaptor = ImagePagerAdapter(supportFragmentManager,institution.pictureUrls as ArrayList<String>)
        imagePager.adapter=imagePagerAdaptor
        dots.attachViewPager(imagePager)

    }




}
