package com.animation.animation.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.animation.animation.R;
import com.animation.animation.adapter.ViewPagerAdapter;
import com.animation.animation.fragment.FreshFragment;
import com.animation.animation.fragment.HotFragment;
import com.animation.animation.fragment.SubscriptionFragment;
import com.animation.animation.http.HttpUtils;
import com.animation.animation.http.Util;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    List<Fragment> fragmentList = new ArrayList<Fragment>();

    @ViewInject(R.id.drawer_layout)
    DrawerLayout drawer;
    @ViewInject(R.id.nav_view)
    NavigationView navigationView;
    @ViewInject(R.id.viewpager_main)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new HttpUtils().hotDownLoad(Util.hotpath);
        x.view().inject(this);

        addFragment();
        setAdapter();
        navigationView.setNavigationItemSelectedListener(this);


    }

    private void setAdapter() {
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),fragmentList));
    }

    private void addFragment() {
        fragmentList.add(new HotFragment());
        fragmentList.add(new FreshFragment());
        fragmentList.add(new SubscriptionFragment());
    }

    @Override
    public void onBackPressed() {

        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id){
            case R.id.nav_scan:
                break;
            case R.id.nav_download:
                break;
            case R.id.nav_buy:
                break;
            case R.id.nav_money:
                break;
            case R.id.nav_test:
                break;
            case R.id.nav_message:
                break;
            case R.id.nav_setting:
                break;
        }

        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
