package com.animation.animation.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.animation.animation.R;

import org.xutils.view.annotation.ContentView;
import org.xutils.x;

/**
 * 详情_评论
 */

@ContentView(R.layout.fragment_comment_layout)
public class CommentFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return x.view().inject(this,inflater,container);
    }
}
