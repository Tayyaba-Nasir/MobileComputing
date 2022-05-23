package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityExam2 extends AppCompatActivity {

    Button RightB,WrongB,NextB;
    int result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_exam2);

        RightB = findViewById(R.id.RightB2);
        WrongB = findViewById(R.id.WrongB2);
        NextB = findViewById(R.id.NextB2);

        Intent mIntent = getIntent();
        result = mIntent.getIntExtra("intVariableName", 0);

        RightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result++;
            }
        });

        WrongB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        NextB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivityExam2.this, MainActivityExam3.class);
                myIntent.putExtra("intVariableName", result);
                startActivity(myIntent);
            }
        });
    }
}