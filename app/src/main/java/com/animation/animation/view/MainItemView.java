package com.animation.animation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.animation.animation.R;

/**
 * Created by luojurong on 2017/2/24.
 */

public class MainItemView extends LinearLayout{

    ImageView img;
    TextView tv;
    public MainItemView(Context context, AttributeSet attrs) {
        super(context, attrs);

        initParams(context);
    }

    private void initParams(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.itemview_main_layout,null);
        img = (ImageView) view.findViewById(R.id.img_itemview);
        tv = (TextView) view.findViewById(R.id.tv_itemview);
    }
    public void setImg(String url){

    }
    public void setImg(int rId){
        img.setImageResource(rId);
    }
    public void setTv(String str){
        tv.setText(str + "");
    }
}
