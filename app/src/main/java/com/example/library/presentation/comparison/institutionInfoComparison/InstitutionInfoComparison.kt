package com.example.library.presentation.comparison.institutionInfoComparison


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.library.R

/**
 * A simple [Fragment] subclass.
 */
class InstitutionInfoComparison : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_institution_info_comparison, container, false)
    }


}
