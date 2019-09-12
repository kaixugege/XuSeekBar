package com.xugege.xuseekbar

import android.util.Log
import android.widget.TextView
import com.xugege.xuseekbar.fragments.ContinuousFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : MainBaseActivity() {
    override fun initCreate() {
        Log.d("MainBaseActivity", " oncreate tab count " + tabLayout.tabCount)
        mFragments.add(ContinuousFragment.newInstance("","tab 1  1"))
        mFragments.add(ContinuousFragment.newInstance("","tab 1 2"))
        mFragments.add(ContinuousFragment.newInstance("","tab 1 3"))
        mFragments.add(ContinuousFragment.newInstance("","tab 1 4"))




        viewPager.adapter = MyPageAdapter(supportFragmentManager,mFragments)
        tabLayout.setupWithViewPager(viewPager)
        for (s in mFragments) {
            val textView = TextView(this)
            val fg = s as ContinuousFragment
            textView.text =fg.getPageTitle()
            textView.setTextColor(resources.getColor(R.color.colorAccent))
            tabLayout.newTab().customView = textView
        }

    }

    override fun layoutId(): Int {
        return R.layout.activity_main
    }


}
