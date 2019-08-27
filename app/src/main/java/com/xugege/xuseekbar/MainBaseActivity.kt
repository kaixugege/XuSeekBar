package com.xugege.xuseekbar

import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

/**
 *   @Author:       KaixuGege
 *   Time:           2019/8/26
 *   ProjectName:    XuSeekBar
 *   ClassName:
 *   Info:
 */
abstract class MainBaseActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hideToolbar()
        setContentView(layoutId())
        initCreate()

    }

    abstract fun initCreate()

}