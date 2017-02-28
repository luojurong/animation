package com.animation.animation.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.animation.animation.R;
import com.animation.animation.adapter.HotRecycleViewAdapter;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luojurong on 2017/2/18.
 */

//@ContentView(R.layout.hot_fragment_layout)
public class HotFragment extends Fragment{

    List<String> data = new ArrayList<String>();

  //  @ViewInject(R.id.rView_hotFragment)
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

     //   RecyclerView recyclerView = new RecyclerView(getActivity());
        View view = inflater.inflate(R.layout.hot_fragment_layout, container,false);
        recyclerView = (RecyclerView) view.findViewById(R.id.rView_hotFragment);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1, LinearLayoutManager.VERTICAL, false));
        setAdapter(inflater);
        return view; //x.view().inject(this,inflater,container)
    }

    private void setAdapter(LayoutInflater inflater) {
        for (int i = 0; i <10; i++) {
            data.add("lalala"+i);
        }
        HotRecycleViewAdapter adapter = new HotRecycleViewAdapter(getActivity(),data,inflater);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    //    @Event(type = View.OnClickListener.class, value = R.id.img_fragment)
    private void onclick(View view){

        ((ImageView)view).setImageResource(android.R.drawable.ic_menu_add);
    }

}
