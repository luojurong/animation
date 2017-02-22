package com.animation.animation.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.animation.animation.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

/**
 * Created by luojurong on 2017/2/18.
 */

@ContentView(R.layout.hot_fragment_layout)
public class HotFragment extends Fragment{

    @ViewInject(R.id.rView_hotFragment)
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        RecyclerView recyclerView = new RecyclerView(getActivity());
        return x.view().inject(this,inflater,container);
    }

//    @Event(type = View.OnClickListener.class, value = R.id.img_fragment)
    private void onclick(View view){

        ((ImageView)view).setImageResource(android.R.drawable.ic_menu_add);
    }

}
