package com.example.vp2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

/**
 * Created by Sven.Wong ON 2021/4/22
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewpager = findViewById<ViewPager2>(R.id.viewpager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
//        viewpager.adapter = DemoViewPagerAdapter()
        val demoFragmentPagerAdapter = DemoFragmentPagerAdapter(this)
        viewpager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewpager.adapter = DemoFragmentPagerAdapter(this)
        viewpager.offscreenPageLimit = 1
//        TabLayoutMediator(tabLayout, viewpager, object : TabLayoutMediator.TabConfigurationStrategy {
//            override fun onConfigureTab(tab: TabLayout.Tab, position: Int) {
//                // Styling each tab here
//                tab.text = "Tab $position"
//            }
//        }).attach()


    }
}
