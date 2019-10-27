package com.example.library.entities

import java.io.Serializable

data class Institution (val title:String,val rating:Float,val description:String,val pictureUrls: List<String>? = null):Serializable