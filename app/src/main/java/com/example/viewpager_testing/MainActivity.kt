package com.example.viewpager_testing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viewpager_testing.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val tabtitle = arrayOf("home", "notification", "cart", "chat", "profile")
//        binding.tablayout.addTab(binding.tablayout.newTab().setText("home"))


        binding.viewpager.adapter = AdapterViewPager(this)
        TabLayoutMediator(binding.tablayout, binding.viewpager) { tab, position ->
            tab.text = tabtitle[position]
        }.attach()
/*       binding.tablayout.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if(tab!=null){
                binding.viewpager.currentItem= tab.position}
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        }) */



    }
}



