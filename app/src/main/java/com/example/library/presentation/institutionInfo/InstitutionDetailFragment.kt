package com.example.library.presentation.institutionInfo


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.library.R
import com.example.library.base.BaseFragment
import com.example.library.entities.Characteristic
import com.example.library.presentation.institutionInfo.characteristic.CharacteristicListAdapter
import com.example.library.presentation.institutionInfo.characteristic.CharacteristicViewModel
import com.example.library.presentation.institutionInfo.date.DateListAdapter
import com.example.library.presentation.institutionInfo.date.DateViewModel
import kotlinx.android.synthetic.main.fragment_institution_detail.*
import org.koin.androidx.viewmodel.ext.android.getViewModel
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class InstitutionDetailFragment : BaseFragment(){
    private lateinit var dateViewModel: DateViewModel
    private lateinit var dateListAdapter: DateListAdapter
    private lateinit var characteristicListAdapter:CharacteristicListAdapter
    private lateinit var characteristicViewModel: CharacteristicViewModel


    override fun layoutId() = R.layout.fragment_institution_detail

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dateViewModel = getViewModel()
        dateViewModel.getDate()
        dateListAdapter = DateListAdapter()
        dateListAdapter.fragment = this
        dateViewModel.dateListLiveData.observe(this,dateListObserver)
        characteristicViewModel=getViewModel()
        characteristicViewModel.getCharacteristic()
        characteristicListAdapter= CharacteristicListAdapter()
        characteristicListAdapter.fragment=this
        characteristicViewModel.characteristicListLiveData.observe(this,characteristicListObserver)

    }
    val dateListObserver = Observer<List<Calendar>> {
        dateListAdapter.setDataSet(it)
    }
    val characteristicListObserver = Observer<List<Characteristic>> {
        characteristicListAdapter.setDataset(it)
    }
    override fun onViewCreated(view:View,savedInstanceState: Bundle?){
        super.onViewCreated(view, savedInstanceState)
        setDateAdapter()
        setCharacteristicAdapter()
    }
    private fun setDateAdapter(){
        dateList.adapter=dateListAdapter
        dateList.layoutManager=LinearLayoutManager(context)
    }
    private fun setCharacteristicAdapter(){
        characteristics.adapter=characteristicListAdapter
        characteristics.layoutManager=LinearLayoutManager(context)
    }



}



























loh))