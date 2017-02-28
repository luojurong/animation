package com.animation.animation.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.animation.animation.R;
import com.animation.animation.adapter.FreshAdapter;
import com.animation.animation.presenter.IFreshPresenter;
import com.animation.animation.presenter.impl.FreshPresenter;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * 更新
 */

@ContentView(R.layout.fresh_fragment_layout)
public class FreshFragment extends Fragment{

    @ViewInject(R.id.fresh_recyclerview)
    RecyclerView recyclerView;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        myAdapter();
        myPost();
        return x.view().inject(this,inflater,container);
    }



    private List<String> list = new ArrayList<>();//数据为空

    /**
     * 设置适配器
     */
    private void myAdapter() {
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),1, LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(new FreshAdapter());
    }

    private IFreshPresenter iFreshPresenter = new FreshPresenter();
    /**
     * 请求数据
     */
    private void myPost() {
        iFreshPresenter.post();
    }






}
