package com.example.myapplication;



import android.os.Bundle;
//import android.widget.Toolbar;
//import android.support.v7.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//import androidx.appcompat.widget.Toolbar;
//import android.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;
//import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {


    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = findViewById(R.id.toolbar_2);

        setSupportActionBar(mToolbar);
    }



}
