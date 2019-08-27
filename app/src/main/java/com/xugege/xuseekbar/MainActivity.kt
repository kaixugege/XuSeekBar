package com.xugege.xuseekbar

import android.os.Bundle
import android.util.Log
import com.xugege.xuseekbar.fragments.ContinuousFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : MainBaseActivity() {
    override fun initCreate() {
        Log.d("MainBaseActivity", " oncreate tab count " + tabLayout.tabCount)
        mFragments.add(ContinuousFragment())
    }

    override fun layoutId(): Int {
        return R.layout.activity_main
    }


}
