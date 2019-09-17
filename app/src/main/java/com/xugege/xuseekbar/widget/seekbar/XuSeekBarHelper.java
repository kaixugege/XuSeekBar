package com.xugege.xuseekbar.widget.seekbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.Log;

import com.xugege.xuseekbar.utils.XuUnitKt;


/**
 * @Author: KaixuGege
 * ProjectName:    XuSeekBar
 * ClassName:
 * Info:
 */
public class XuSeekBarHelper {


    private String progressText = "";
    private XuSeekBar mBar;
    private Paint mPaint; // 画笔
    private Rect mProgressTextRect = new Rect();   // 进度文字位置信息
    // 滑块按钮宽度

    private int mThumbWidth;
    private String color = "#929292";

    public static XuSeekBarHelper newInstance(XuSeekBar seekBar) {
        XuSeekBarHelper xuSeekBarHelper = new XuSeekBarHelper(seekBar);
        return xuSeekBarHelper;
    }

    private XuSeekBarHelper(XuSeekBar seekBar) {
        this.mBar = seekBar;
    }

    public XuSeekBarHelper init(Context context) {
        this.mThumbWidth = XuUnitKt.dp2px(50, context);
        this.mPaint = new TextPaint();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(Color.parseColor(this.getColor()));
        this.mPaint.setTextSize(XuUnitKt.sp2px(16,context));
        // 如果不设置padding，当滑动到最左边或最右边时，滑块会显示不全
        this.mBar.setPadding(mThumbWidth / 3, 0, mThumbWidth / 3, 0);
        return this;
    }

    public XuSeekBarHelper draw(Canvas canvas) {
        Log.d("Helper", "ondraw" + this.getProgressText());
        String progressText = mBar.getProgress() + "%";
        mPaint.getTextBounds(progressText, 0, progressText.length(), mProgressTextRect);


        // 进度百分比
        float progressRatio = (float) mBar.getProgress() / mBar.getMax();
        // thumb偏移量
        float thumbOffset = (mThumbWidth - mProgressTextRect.width()) / 2 - mThumbWidth * progressRatio;
        float thumbX = mBar.getWidth() * progressRatio + thumbOffset;
        float thumbY = mBar.getHeight() / 2f + mProgressTextRect.height() / 2f - mProgressTextRect.height() - mProgressTextRect.height() * 0.5f;
        Log.d("Helper", "ondraw  thumbX "+thumbX+" thumbY "+thumbY +"  "+progressRatio);
        canvas.drawText(progressText, thumbX, thumbY, mPaint);

        return this;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProgressText() {
        return mBar.getProgress() + "%";
    }

}
