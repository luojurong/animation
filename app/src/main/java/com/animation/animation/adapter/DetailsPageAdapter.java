package com.animation.animation.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.LinkedList;
import java.util.List;

/**
 * 详情页viewpager适配器
 */

public class DetailsPageAdapter extends FragmentPagerAdapter {
    private List<Fragment> list = new LinkedList<>();
    private List<String> titleList = new LinkedList<>();

    public DetailsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    public void addFragment(Fragment fragment , String title){
        list.add(fragment);
        titleList.add(title);
    }


    /**
     * 设置标题
     * @param position
     * @return
     */
    @Override
    public CharSequence getPageTitle(int position) {
        return titleList.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }


}
