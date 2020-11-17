package com.example.sand_box;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Time_table_Main_file extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table__main_file);
    }
    public void day1(View view) {
        Intent intent = new Intent(this ,day1.class);
        startActivity(intent);
    }
}