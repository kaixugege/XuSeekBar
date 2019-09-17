package com.xugege.xuseekbar.utils

import android.content.Context
import android.util.TypedValue

/**
 *   @Author:       KaixuGege
 *   Time:           2019/9/17
 *   ProjectName:    XuSeekBar
 *   ClassName:
 *   Info:
 */
/**
 * dp转px
 *
 * @param dp dp值
 * @return px值
 */
fun dp2px(dp: Float, context: Context): Int {
    return TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP, dp,
        context.getResources().getDisplayMetrics()
    ).toInt()
}


/**
 * sp转px
 *
 * @param sp sp值
 * @return px值
 */
 fun sp2px(sp: Float, context: Context): Int {
    return TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_SP, sp,
        context.getResources().getDisplayMetrics()
    ).toInt()
}