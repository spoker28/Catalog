package com.example.library.base

interface BaseListenerAdapter<T> {
    fun onClick(pos: Int, item: T)
}