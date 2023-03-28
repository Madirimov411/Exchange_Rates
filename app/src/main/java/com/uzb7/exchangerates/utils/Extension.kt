package com.uzb7.moviedb.utils

import android.view.View

object Extension {

    fun View.show(){
        this.visibility=View.VISIBLE
    }
    fun View.hide(){
        this.visibility=View.GONE
    }

    private fun String.flag(){
        this.substring(0,2).lowercase()
    }

    fun flagUrl(s:String) = "https://flagcdn.com/h24/${s.flag()}.png"

}