package com.example.library.entities

data class Sample(
    var title: String? = null,
    var description: String? = null
) {
    constructor() : this(null, null)
}