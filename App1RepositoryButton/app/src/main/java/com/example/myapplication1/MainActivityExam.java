package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityExam extends AppCompatActivity {

    Button RightB,WrongB,NextB;
    int result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_exam);

        RightB = findViewById(R.id.RightB);
        WrongB = findViewById(R.id.WrongB);
        NextB = findViewById(R.id.NextB);

        RightB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(result != 0){
                    result--;
                }
            }
        });

        WrongB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    result++;
            }
        });

        NextB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivityExam.this, MainActivityExam1.class);
                myIntent.putExtra("intVariableName", result);
                startActivity(myIntent);
            }
        });
    }
}