package com.uzb7.exchangerates.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.uzb7.exchangerates.R
import com.uzb7.exchangerates.model.Symboles
import com.uzb7.moviedb.utils.Extension.flagUrl

class SpinnerRatesAdapter(val context:Context,val list: ArrayList<Symboles>):BaseAdapter(){


    override fun getCount(): Int {
        if (list != null) return list.size
        else return 0
    }

    override fun getItem(p0: Int): Any? {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup): View {

        val rootView =  LayoutInflater.from(context).inflate(R.layout.custom_spinner_items,viewGroup,false)
        val flag=rootView.findViewById<ImageView>(R.id.stateFlags)
        val name=rootView.findViewById<TextView>(R.id.stateName)
        Glide.with(flag).load("https://flagcdn.com/h24/${list[position].abbr.substring(0,2).lowercase()}.png"  /*flagUrl(list[position].abbr)*/).error(R.drawable.ic_close).placeholder(R.drawable.ic_close).into(flag)
        name.text="${list[position].abbr} -- ${list[position].state}"
        return rootView
    }

}
