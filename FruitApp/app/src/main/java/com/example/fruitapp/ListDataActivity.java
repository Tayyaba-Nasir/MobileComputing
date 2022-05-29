package com.example.fruitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListDataActivity extends AppCompatActivity {

    TextView listData;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_data);

        listData=findViewById(R.id.listData);
        imageView=findViewById(R.id.imageView);

        Intent intent = getIntent();
        listData.setText(intent.getStringExtra("name"));
        imageView.setImageResource(intent.getIntExtra("image",0));
    }
}