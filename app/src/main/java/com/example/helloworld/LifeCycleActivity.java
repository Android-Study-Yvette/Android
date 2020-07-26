package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("this activity is onCreate");
        setContentView(R.layout.activity_life_cycle);
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("this activity is onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("this activity is onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("this activity is onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("this activity is onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("this activity is onDestroy");
    }
}
