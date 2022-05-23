package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button,learning,exam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        learning = findViewById(R.id.learning);
        exam = findViewById(R.id.exam);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //String url = "https://github.com/Tayyaba-Nasir/MobileComputing.git";
                gotoUrl("https://github.com/Tayyaba-Nasir/MobileComputing.git");

            }
        });

        learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });

        exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivityExam.class);
                startActivity(intent);
            }
        });
    }

    private void gotoUrl(String url) {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}