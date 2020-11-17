package com.example.sand_box;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class day1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day1);
    }
    public void Add_event(View view) {
        Intent intent = new Intent(this ,event_adder.class);
        startActivity(intent);
    }
}