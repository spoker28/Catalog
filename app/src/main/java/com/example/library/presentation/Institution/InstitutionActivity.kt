package com.example.library.presentation.Institution

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.example.library.Place
import com.example.library.Places
import com.example.library.R
import com.example.library.entities.CategoryItem
import kotlinx.android.synthetic.main.activity_institution.*
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.getViewModel


class InstitutionActivity : AppCompatActivity(),InstitutionAdapter.InstitutionListener {

    private lateinit var viewModel: InstitutionViewModel
    private var institutionAdapter = InstitutionAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_institution)

        RecyclerView.layoutManager = GridLayoutManager(this, 4)

        viewModel = getViewModel()
        institutionAdapter.setListener(this)

        RecyclerView.adapter = institutionAdapter

        viewModel.getInstitutions()

        viewModel.institutionListLiveData.observe(this, Observer {
            institutionAdapter.setDataSet(it)
        })
    }


    override fun onClick(item: CategoryItem) {
        val mIntent = Intent(this, main::class.java)
        startActivity(mIntent)
    }
}
