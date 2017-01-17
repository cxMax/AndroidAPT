package com.cxmax.demo.androidapt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.Test;

@Test
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
