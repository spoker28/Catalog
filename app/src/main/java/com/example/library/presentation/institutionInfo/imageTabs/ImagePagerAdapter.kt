package com.example.library.presentation.institutionInfo.imageTabs

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.library.presentation.institutionInfo.imageTabs.ImageFragment.Companion.EVENT_IMAGE_LINK

class ImagePagerAdapter(fm:FragmentManager,var listitems:ArrayList<String>):FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        val data = Bundle()
        data.putString(EVENT_IMAGE_LINK,listitems.get(position))
        return ImageFragment.newInstance(data)
          }

    override fun getCount():Int = listitems.size


}