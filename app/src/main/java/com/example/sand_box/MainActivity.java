package com.example.sand_box;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void shopping(View view) {
        Intent intent = new Intent(this ,new_terminal.class);
        startActivity(intent);
    }
    public void TimeTable(View view) {
        Intent intent = new Intent(this ,Time_table_Main_file.class);
        startActivity(intent);
    }
}