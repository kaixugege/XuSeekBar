package com.xugege.xuseekbar

import android.content.Context
import android.os.Bundle

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
    }

}