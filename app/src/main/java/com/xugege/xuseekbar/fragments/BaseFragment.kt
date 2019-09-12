package com.xugege.xuseekbar.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 *   @Author:       KaixuGege
 *   Time:           2019/8/27
 *   ProjectName:    XuSeekBar
 *   ClassName:
 *   Info:
 */
abstract class BaseFragment : Fragment() {

    public var title: String? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root =inflater.inflate(layout(),container,false)
        initView(root)
        return root
    }

    abstract fun layout():Int

    abstract fun initView(root: View)
}