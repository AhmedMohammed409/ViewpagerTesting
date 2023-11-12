package com.example.viewpager_testing

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class AdapterViewPager (activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return 5
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }

            1 -> {
                NotificationFragment()
            }

            2 -> {
                CartFragment()
            }

            3 -> {
                ChatFragment()
            }

            else -> {
                ProfileFragment()
            }
        }

    }

}
