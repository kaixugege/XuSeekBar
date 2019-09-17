package com.xugege.xuseekbar.widget.seekbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;

import com.xugege.xuseekbar.R;

/**
 * @Author: KaixuGege
 * Time:           2019/9/17
 * ProjectName:    XuSeekBar
 * ClassName:
 * Info:
 */
public class XuSeekBar extends AppCompatSeekBar {

    private XuSeekBarHelper xuSeekBarHelper;

    public XuSeekBar(Context context) {
        this(context,null);
    }

    public XuSeekBar(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.seekBarStyle);
    }

    public XuSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.xuSeekBarHelper = XuSeekBarHelper.newInstance(this)
                .init(context);
    }

    @Override
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.xuSeekBarHelper.draw(canvas);
    }
}
