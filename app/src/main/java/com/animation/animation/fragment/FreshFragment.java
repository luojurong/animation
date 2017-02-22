package com.animation.animation.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.animation.animation.R;
import com.animation.animation.presenter.IFreshPresenter;
import com.animation.animation.presenter.impl.FreshPresenter;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * 更新
 */

@ContentView(R.layout.fresh_fragment_layout)
public class FreshFragment extends Fragment{
    @ViewInject(R.id.sevenListView)
    ListView sevenListView;
    ViewPager viewPager;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        post();

//
        return x.view().inject(this,inflater,container);
    }

    private IFreshPresenter iFreshPresenter = new FreshPresenter();
    /**
     * 请求
     */
    @Event(R.id.btn1)
    private void post() {
        Log.e("dasdas","dasdasdasd");
        iFreshPresenter.post();
    }






}
