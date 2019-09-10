package com.xugege.xuseekbar.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xugege.xuseekbar.R
import kotlinx.android.synthetic.main.activity_main.view.*

/**
 *   @Author:       KaixuGege
 *   Time:           2019/8/27
 *   ProjectName:    XuSeekBar
 *   ClassName:
 *   Info:
 */
class ContinuousFragment() : BaseFragment() {
    override fun initView(root: View) {

        Log.d(this.javaClass.simpleName,"initView")
    }

    override fun layout(): Int {
        return R.layout.fragment_continuous
    }

    private var username: String = ""
    private var age: Int = 0

    /**
     * 静态内部类
     */
    companion object {
        //apply像一个匿名函数，返回对象的本身
        fun newInstance(param1: String, title: String) = ContinuousFragment().apply {
            arguments = Bundle().apply {
                putString(PARAM1, param1)
                putString(TITLE, title)
            }
        }
    }

    fun getPageTitle(): String {
        return arguments!!.get(TITLE).toString()
    }



}

private const val PARAM1 = "param1"
private const val PARAM2 = "param2"
private const val TITLE = "param1"