package com.animation.animation.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.animation.animation.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.x;

import java.util.List;

/**
 * Created by luojurong on 2017/2/20.
 */

public class HotRecycleViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private Context context;
    private List<String> data;
    private LayoutInflater inflater;
    private int initPosition = 0;

    public HotRecycleViewAdapter(Context context,List<String> data, LayoutInflater inflater) {
        this.context = context;
        this.data = data;
        this.inflater = inflater;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getItemViewType(int position) {
        if(position == data.size()-1 || initPosition+4 == position
                || position == initPosition +7){
            return 5; //水平滑动布局
        } else
            return 0;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        RecyclerView.ViewHolder holder = null;

        switch (viewType){

            case 1:
                view = inflater.inflate(R.layout.adapter_hot_layout1,parent,false);
                holder = new ViewHolder2(view);
                break;
            case 2:
                view = inflater.inflate(R.layout.adapter_hot_layout2,parent,false);
                holder = new ViewHolder3(view);
                break;
            case 3:
                view = inflater.inflate(R.layout.adapter_hot_layout3,parent,false);
                holder = new ViewHolder4(view);
                break;
            case 4:
                view = inflater.inflate(R.layout.adapter_hot_layout4,parent,false);
                holder = new ViewHolder1(view);
                break;
            case 5:
                view = inflater.inflate(R.layout.adapter_hot_layout5,parent,false);
                holder = new ViewHolder5(view);
                break;
            case 0:
//                view = inflater.inflate(R.layout.adapter_hot_layout1,parent,false);
//                holder = new ViewHolder1(view);
                break;
        }


        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)){

            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 0:

                break;
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private class ViewHolder1 extends RecyclerView.ViewHolder{

        public ViewHolder1(View itemView) {
            super(itemView);
        }
    }
    private class ViewHolder2 extends RecyclerView.ViewHolder{

        public ViewHolder2(View itemView) {
            super(itemView);
        }
    }
    private class ViewHolder3 extends RecyclerView.ViewHolder{

        public ViewHolder3(View itemView) {
            super(itemView);
        }
    }
    private class ViewHolder4 extends RecyclerView.ViewHolder{

        public ViewHolder4(View itemView) {
            super(itemView);
        }
    }
    private class ViewHolder5 extends RecyclerView.ViewHolder{

        public ViewHolder5(View itemView) {
            super(itemView);
        }
    }
}
