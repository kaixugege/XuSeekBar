package com.xugege.xuseekbar

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
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
}