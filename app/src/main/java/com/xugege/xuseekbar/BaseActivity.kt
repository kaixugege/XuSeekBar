package com.xugege.xuseekbar

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.PagerAdapter
import android.support.v7.app.AppCompatActivity
import com.xugege.xuseekbar.fragments.ContinuousFragment
import java.util.ArrayList

/**
 *   @Author:       KaixuGege
 *   Time:           2019/8/26
 *   ProjectName:    XuSeekBar
 *   ClassName:
 *   Info:
 */
abstract class BaseActivity : AppCompatActivity() {
    abstract fun layoutId(): Int
    protected var sType =
        arrayOf("continuous", "discrete", "custom", "java", "indicator", "donation")
    protected var mFragments = ArrayList<Fragment>()
    fun hideToolbar() {
        supportActionBar?.hide()
    }

    class MyPageAdapter(fm: FragmentManager, fragments: ArrayList<Fragment>) :
        FragmentPagerAdapter(fm) {


        private val fm: FragmentManager
        private var mFragments: ArrayList<Fragment>

        init {
            this.fm = fm
            mFragments = fragments
        }


        override fun getItem(position: Int): Fragment {
            return mFragments.get(position)
        }

        override fun getCount(): Int {
            return mFragments.size
        }

        override fun getPageTitle(position: Int): CharSequence? {
           val ccc =  mFragments.get(position) as ContinuousFragment
            return  ccc.title
        }

    }
}