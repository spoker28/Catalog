package com.example.library.presentation.institutionInfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.library.R
import com.example.library.entities.Institution
import com.example.library.presentation.institutionInfo.imageTabs.ImagePagerAdapter
import kotlinx.android.synthetic.main.activity_institutions_detail.*
import android.view.View


class InstitutionsDetailActivity : AppCompatActivity() {
    private lateinit var institution:Institution
    val institutionDetail= InstitutionDetailFragment()
//    private lateinit var

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_institutions_detail)
        institution = intent.getSerializableExtra("institution") as Institution//Принимает информацию об ивенте
        setSupportActionBar(toolbar)

        comparisonButton.setOnClickListener {


        }

        supportActionBar?.apply {
            title = "Catalog"
            setDisplayShowHomeEnabled(true)
            setDisplayHomeAsUpEnabled(true)
        }
        bindPagerAdapter()

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
        supportFragmentManager.beginTransaction().add(R.id.bottomContainer,institutionDetail).commit()
        dots.attachViewPager(imagePager)

    }




}
