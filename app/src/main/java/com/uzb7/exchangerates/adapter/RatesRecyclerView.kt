package com.uzb7.exchangerates.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uzb7.exchangerates.R
import com.uzb7.exchangerates.model.Symboles

class RatesRecyclerView(val flagList:ArrayList<Symboles>,val courseList:ArrayList<Double>):RecyclerView.Adapter<RatesRecyclerView.RatesViewHolder>() {

    fun submitList(newflagList:ArrayList<Symboles>,newcourseList:ArrayList<Double>){
        flagList.clear()
        courseList.clear()
        flagList.addAll(newflagList)
        courseList.addAll(newcourseList)
    }

    class RatesViewHolder(view: View):RecyclerView.ViewHolder(view){

        val flag: ImageView =view.findViewById(R.id.countryFlag)
        val nameCountry: TextView =view.findViewById(R.id.countryAbbr)
        val nameState: TextView =view.findViewById(R.id.countryName)
        val courses: TextView =view.findViewById(R.id.courses)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RatesViewHolder {
        return RatesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rates_courses,parent,false))
    }

    override fun getItemCount() = flagList.size

    override fun onBindViewHolder(holder: RatesViewHolder, position: Int) {
        val flagL=flagList[position]
        val course=courseList[position]
        holder.apply {
            Glide.with(flag).load("https://flagcdn.com/56x42/${flagL.abbr.substring(0,2).lowercase()}.png").into(flag)
            nameCountry.text=flagL.abbr
            nameState.text=flagL.state
            courses.text= course.toString()
        }
    }
}