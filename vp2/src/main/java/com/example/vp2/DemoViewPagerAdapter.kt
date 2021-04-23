package com.example.vp2

import android.graphics.Color.blue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by Sven.Wong ON 2021/4/22
 */


class DemoViewPagerAdapter : RecyclerView.Adapter<DemoViewPagerAdapter.EventViewHolder>() {
    val eventList = listOf("0", "1", "2")

    // Layout "layout_demo_viewpager2_cell.xml" will be defined later
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            EventViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_demo_viewpager2_cell, parent, false))

    override fun getItemCount() = eventList.count()
    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        (holder.view as? TextView)?.also {
            it.text = "Page " + eventList.get(position)

            val backgroundColorResId = if (position % 2 == 0) android.R.color.holo_green_dark else android.R.color.holo_red_light
            it.setBackgroundColor(ContextCompat.getColor(it.context, backgroundColorResId))
        }
    }

    class EventViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}