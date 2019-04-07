package com.example.administrator.myapplication;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import io.flutter.facade.Flutter;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View flutterView = Flutter.createView(
                        MainActivity.this,
                        getLifecycle(),
                        "route1"
                );
                FrameLayout.LayoutParams layout = new FrameLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT);

                /*FrameLayout.LayoutParams layout = new FrameLayout.LayoutParams(600, 800);
                layout.leftMargin = 100;
                layout.topMargin = 200;*/
                addContentView(flutterView, layout);
            }
        });
    }
}
