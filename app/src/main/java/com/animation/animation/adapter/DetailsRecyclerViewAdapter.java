package com.animation.animation.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.androidkun.adapter.BaseAdapter;
import com.androidkun.adapter.ViewHolder;
import com.animation.animation.R;

import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * 详情_更多推荐
 */
public class DetailsRecyclerViewAdapter extends BaseAdapter<Integer>{

    public DetailsRecyclerViewAdapter(Context context, int layoutId, List<Integer> datas) {
        super(context, layoutId, datas);
    }

    @Override
    public void convert(ViewHolder holder, Integer integer) {

    }
}
