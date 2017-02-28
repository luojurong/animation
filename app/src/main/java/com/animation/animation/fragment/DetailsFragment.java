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

import com.animation.animation.R;
import com.animation.animation.adapter.DetailsRecyclerViewAdapter;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * 详情页_详情
 */

@ContentView(R.layout.fragment_details_layout)
public class DetailsFragment extends Fragment {
    @ViewInject(R.id.rv_details)
    RecyclerView rv_details;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        myAdapter();
        return x.view().inject(this, inflater, container);
    }

    private List<Integer> list = new ArrayList<>();


    private DetailsRecyclerViewAdapter adapter;

    /**
     * 适配器
     */
    private void myAdapter() {

    }

}
