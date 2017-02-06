package com.feicui.as;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity
{
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = ((TextView) findViewById(R.id.tv));

        //找到当前控件的父控件
        DisplayMetrics metrics = new DisplayMetrics();
        //给当前的metrics设置当前屏幕信息（宽高）
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        Log.i("AAA", "屏幕宽度  " + metrics.widthPixels);
        Log.i("AAA", "屏幕高度   " + metrics.heightPixels);

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                (int) (metrics.widthPixels * 0.5),
                (int) (metrics.heightPixels * 0.5));

        //设置布局参数
        tv.setLayoutParams(params);
    }
}
