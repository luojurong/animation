package com.animation.animation.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.animation.animation.R;
import com.animation.animation.adapter.DetailsPageAdapter;
import com.animation.animation.fragment.CommentFragment;
import com.animation.animation.fragment.DetailsFragment;
import com.animation.animation.fragment.SelectFragment;
import com.animation.animation.presenter.IFreshPresenter;
import com.animation.animation.presenter.impl.FreshPresenter;
import com.animation.animation.view.AppBarStateChangeListener;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * 详情页
 */
@ContentView(R.layout.activity_scrolling)
public class ScrollingActivity extends AppCompatActivity {
    @ViewInject(R.id.mViewPager_details)
    private ViewPager mViewPager;
    @ViewInject(R.id.collapsing_toolbar_layout)
    CollapsingToolbarLayout mCollapsingToolbarLayout;
    @ViewInject(R.id.app_bar)
    AppBarLayout mAppBarLayout;
    @ViewInject(R.id.tabs)
    private TabLayout tabLayout;
    @ViewInject(R.id.mToolbar)
    private Toolbar mToolbar;

    private IFreshPresenter presenter = new FreshPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);

        myAdapter();
        mCollapsingToolbarLayout.setTitle("未闻花名");
        mCollapsingToolbarLayout.setExpandedTitleColor(Color.parseColor("#ffffffff"));//设置还没收缩时状态下字体颜色
        mAppBarLayout.addOnOffsetChangedListener(new AppBarStateChangeListener() {
            @Override
            public void onStateChanged(AppBarLayout appBarLayout, State state) {
                Log.d("STATE", state.name());
                if (state == State.EXPANDED) {

                    //展开状态

                } else if (state == State.COLLAPSED) {

                    //折叠状态
//                    mToolbar.setVisibility(View.GONE);
                } else {

                    //中间状态

                }
            }
        });
        myhttp();
    }


    /**
     * 返回上一菜单
     */
    @Event(R.id.onBackPressed)
    private void BackPressed() {
        onBackPressed();
    }

    /**
     * 请求数据
     */
    private void myhttp() {
        presenter.post();
    }

    /**
     * 设置适配器
     */
    private void myAdapter() {
        DetailsPageAdapter adapter = new DetailsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new DetailsFragment(), "详情");
        adapter.addFragment(new SelectFragment(), "选集");
        adapter.addFragment(new CommentFragment(), "评论");
        mViewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(mViewPager);
    }


}
