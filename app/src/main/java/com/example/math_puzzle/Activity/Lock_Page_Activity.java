package com.example.math_puzzle.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.math_puzzle.R;

public class Lock_Page_Activity extends AppCompatActivity {

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lock_page);
        gridView = findViewById(R.id.gridview);
    }
}