package com.xugege.xuseekbar

import android.util.Log
import android.widget.TextView
import com.xugege.xuseekbar.fragments.ContinuousFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : MainBaseActivity() {
    override fun initCreate() {
        Log.d("MainBaseActivity", " oncreate tab count " + tabLayout.tabCount)
        mFragments.add(ContinuousFragment(""))
        mFragments.add(ContinuousFragment(""))
        mFragments.add(ContinuousFragment(""))
        mFragments.add(ContinuousFragment(""))

        viewPager.adapter = MyPageAdapter(supportFragmentManager,mFragments)
        tabLayout.setupWithViewPager(viewPager)
        for (s in sType) {
            val textView = TextView(this)
            textView.text = s
            textView.setTextColor(resources.getColor(R.color.colorAccent))
            tabLayout.newTab().customView = textView
        }

    }

    override fun layoutId(): Int {
        return R.layout.activity_main
    }


}
