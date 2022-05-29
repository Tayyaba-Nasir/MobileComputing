package com.example.fruitapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    String alphabets[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    int[] images = {R.drawable.apple,R.drawable.banana,R.drawable.candle,R.drawable.duck,R.drawable.elephant,R.drawable.flag,R.drawable.gun,R.drawable.hen,R.drawable.iglo,R.drawable.jug,R.drawable.kettle,R.drawable.lemon,R.drawable.mango,R.drawable.nest,R.drawable.orange,R.drawable.parrot,R.drawable.queen,R.drawable.rainbow,R.drawable.sun,R.drawable.tree,R.drawable.umbrella,R.drawable.van,R.drawable.watermelon,R.drawable.xray,R.drawable.yoyo,R.drawable.zebra};
    String names[] = {"Apple","Banana","Candle","Duck","Elephant","Flag","Gun","Hen","Iglo","Jug","Kettle","Lemon","Mango","Nest","Orange","Parrot","Queen","Rainbow","Sun","Tree","Umbrella","Van","Watermelon","X-Ray","Yoyo","Zebra"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = findViewById(R.id.ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_listview,R.id.textView,alphabets);

        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,ListDataActivity.class);
                intent.putExtra("name",names[i]);
                intent.putExtra("image",images[i]);
                startActivity(intent);
            }
        });

    }
}