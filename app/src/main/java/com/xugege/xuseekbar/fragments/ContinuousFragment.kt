package com.xugege.xuseekbar.fragments

import android.annotation.SuppressLint

/**
 *   @Author:       KaixuGege
 *   Time:           2019/8/27
 *   ProjectName:    XuSeekBar
 *   ClassName:
 *   Info:
 */
class ContinuousFragment() : BaseFragment() {

    private var username: String = ""
    private var age: Int = 0


    /**
     * 静态内部类
     */
    companion object {
        //apply像一个匿名函数，返回对象的本身
        val newInstance = ContinuousFragment().apply {

        }

    }


}