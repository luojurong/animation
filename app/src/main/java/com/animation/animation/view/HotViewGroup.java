package com.animation.animation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by luojurong on 2017/2/20.
 */

public class HotViewGroup extends ViewGroup{
    public HotViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        int count = getChildCount();

        if(count == 1){
            getChildAt(0).layout(0,0,getWidth(),400);
        } else if(count == 2){
            getChildAt(0).layout(0,0,getWidth()/2-10,getChildAt(0).getMeasuredHeight());
            getChildAt(1).layout(getWidth()/2+10,0,getWidth(),getChildAt(1).getMeasuredHeight());
        } else if(count == 3){
            getChildAt(0).layout(0,0,getWidth()/3-10,getChildAt(0).getMeasuredHeight());
            getChildAt(1).layout(getWidth()/3+5,0,getWidth()/3*2-5,getChildAt(1).getMeasuredHeight());
            getChildAt(2).layout(getWidth()/3*2+10,0,getWidth(),getChildAt(2).getMeasuredHeight());
        }
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            View child = getChildAt(i);
            measureChild(child,widthMeasureSpec,heightMeasureSpec);
        }
    }
}
