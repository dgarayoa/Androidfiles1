package edu.uoc.startview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    multitouch myTouchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myTouchView = new multitouch(this);
        setContentView(myTouchView);
        //setContentView(R.layout.activity_main);
    }
}