package com.common;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.hencoder.hencoderpracticedraw1.R;

/**
 * MainActivity 首页
 * author:张冠之
 * time: 2017/8/31 上午11:34
 * e-mail: guanzhi.zhang@sojex.cn
 */

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);
    }
}
