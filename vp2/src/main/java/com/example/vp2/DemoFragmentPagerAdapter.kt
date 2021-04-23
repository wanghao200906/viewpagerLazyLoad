package com.example.vp2

import android.util.SparseArray
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class DemoFragmentPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    private val fragments: SparseArray<MyFragment> = SparseArray()

    init {
        fragments.put(PAGE_HOME, MyFragment.newInstance(0))
        fragments.put(PAGE_FIND, MyFragment.newInstance(1))
        fragments.put(PAGE_INDICATOR, MyFragment.newInstance(2))
        fragments.put(PAGE_OTHERS, MyFragment.newInstance(3))
        fragments.put(PAGE_OTHERS1, MyFragment.newInstance(4))
        fragments.put(PAGE_OTHERS2, MyFragment.newInstance(5))
        fragments.put(PAGE_OTHERS3, MyFragment.newInstance(6))
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

    override fun getItemCount(): Int {
        return fragments.size()
    }

    companion object {

        const val PAGE_HOME = 0

        const val PAGE_FIND = 1

        const val PAGE_INDICATOR = 2

        const val PAGE_OTHERS = 3
        const val PAGE_OTHERS1 = 4
        const val PAGE_OTHERS2 = 5
        const val PAGE_OTHERS3 =6

    }
}
