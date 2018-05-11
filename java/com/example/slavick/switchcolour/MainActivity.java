package com.example.slavick.switchcolour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.firstView)
    View firstView;
    @BindView(R.id.secView)
    View secView;
    @BindView(R.id.thirdView)
    View thirdView;
    @BindView(R.id.fourthView)
    View forthView;

    public int timeFirst(){
        int i =(int)System.currentTimeMillis()* 2000;
        int t = 185589 - i;
        return t;
    }
    public int timeSecond(){
        int i =(int)System.currentTimeMillis()* 200;
        int t = 320000 - i;
        return t;
    }
    public int timeThird(){
        int i =(int)System.currentTimeMillis() * 20;
        int t = 555555 - i;
        return t;
    }
    public int timeFourth(){
        int i =(int)System.currentTimeMillis()* 20000;
        int t = 665577 - i;
        return t;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.firstView)
    public void onClick(){
        firstView.setBackgroundColor(timeFirst());
        secView.setBackgroundColor(timeSecond());
        thirdView.setBackgroundColor(timeThird());
        forthView.setBackgroundColor(timeFourth());

    }
    @OnClick(R.id.secView)
    public void onSecondClick(){
        firstView.setBackgroundColor(timeSecond());
        secView.setBackgroundColor(timeThird());
        thirdView.setBackgroundColor(timeFourth());
        forthView.setBackgroundColor(timeFirst());
    }
    @OnClick(R.id.thirdView)
    public void onThirdClick(){
        firstView.setBackgroundColor(timeThird());
        secView.setBackgroundColor(timeFourth());
        thirdView.setBackgroundColor(timeFirst());
        forthView.setBackgroundColor(timeSecond());
    }
    @OnClick(R.id.fourthView)
    public void onFourthClick(){
        firstView.setBackgroundColor(timeFourth());
        secView.setBackgroundColor(timeFirst());
        thirdView.setBackgroundColor(timeSecond());
        forthView.setBackgroundColor(timeThird());
    }

}
