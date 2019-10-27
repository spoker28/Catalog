package com.example.library.presentation.institutionInfo.imageTabs


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.library.R
import com.example.library.extensions.loadImage
import kotlinx.android.synthetic.main.fragment_image_event.view.*

/**
 * A simple [Fragment] subclass.
 */
class ImageFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image_event, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val link=arguments?.getString(EVENT_IMAGE_LINK)
        view.eventImage.loadImage(link?:"",this)
    }
    companion object{
        fun newInstance(data:Bundle?):ImageFragment{
            val fragment=ImageFragment()
            fragment.arguments = data
            return fragment
        }
        const val EVENT_IMAGE_LINK="EVENT_IMAGE_LINK"
    }


}
