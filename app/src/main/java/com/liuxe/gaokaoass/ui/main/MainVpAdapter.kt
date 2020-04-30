package com.liuxe.gaokaoass.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class MainVpAdapter (var fragmentActivity: FragmentActivity,var list: ArrayList<Fragment>): FragmentStateAdapter(fragmentActivity){

    override fun getItemCount(): Int = list.size

    override fun createFragment(position: Int): Fragment  = list[position]

}