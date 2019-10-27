package com.example.library.presentation.InstitutionsList

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.library.R
import com.example.library.base.BaseFragment
import com.example.library.entities.Institution
import com.example.library.presentation.institutionInfo.InstitutionsDetailActivity
import kotlinx.android.synthetic.main.fragment_institutions.*
import org.koin.androidx.viewmodel.ext.android.getViewModel
import java.io.Serializable

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [InstitutionsFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [InstitutionsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class InstitutionsFragment : BaseFragment(),OnInstitutionClickListener {

    private lateinit var viewModel: InstitutionListViewModel
    private lateinit var institutionListAdapter:InstitutionListAdapter


    override fun layoutId() = R.layout.fragment_institutions
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel=getViewModel()
        viewModel.getInstitutions()
        institutionListAdapter= InstitutionListAdapter()
        institutionListAdapter.fragment = this
        institutionListAdapter.institutionClickListener = this
        viewModel.institutionLiveData.observe(this, institutionListObserver)

    }
    val institutionListObserver = Observer<List<Institution>>{
        institutionListAdapter.setDataSet(it)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAdapter()
    }
    private fun setAdapter(){
        institutionsList.adapter =institutionListAdapter
        institutionsList.layoutManager = LinearLayoutManager(context)
    }


    override fun onClick(pos: Int, item: Institution) {
        val intent = Intent(context,InstitutionsDetailActivity::class.java)
        intent.putExtra("institution",item as Serializable)// отправляет информацию об ивенте в InstitutionDetailActivity
        startActivity(intent)

    }

}
interface OnInstitutionClickListener {
    fun onClick(pos: Int, item: Institution)
}
