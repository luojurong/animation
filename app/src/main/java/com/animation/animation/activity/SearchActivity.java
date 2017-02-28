package com.animation.animation.activity;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.animation.animation.R;
import com.animation.animation.view.HotWordFlowLayout;

/**
 * 搜索界面
 */

public class SearchActivity extends AppCompatActivity {
    private ImageView img_back;
    private HotWordFlowLayout flowLayout;
    private String[] data = new String[]{"镖人", "肉体改造", "脑洞",
            "天下烦恼", "穿越", "过心花", "同居",
            "冠瘿", "短篇", "百炼成神", "秦时明月",
            "女帝", "龙马的雅号", "漂泊者", "恋爱",
            "百万叠迷宫", "吸血鬼", "救世之茧"};
    private LayoutInflater mInflater;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search2);

        mInflater = LayoutInflater.from(this);
        initView();
        SearchToIndex();
        initData();

    }

    private void initView() {
        img_back = (ImageView) findViewById(R.id.img_back);
        flowLayout = (HotWordFlowLayout) findViewById(R.id.flowlayout);
    }

    private void SearchToIndex(){
        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SearchActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initData() {
        for (int i = 0; i < data.length; i++) {
            TextView tv = (TextView) mInflater.inflate(
                    R.layout.search_label_tv, flowLayout, false);
            tv.setText(data[i]);
            final String str = tv.getText().toString();
            //点击事件
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            flowLayout.addView(tv);//添加到父View
        }
    }

}
