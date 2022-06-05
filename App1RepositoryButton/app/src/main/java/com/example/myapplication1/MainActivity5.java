package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity5 extends AppCompatActivity {

    ListView simpleList;
    String alphabets[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        simpleList = findViewById(R.id.ListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.activity_listview,R.id.textView,alphabets);

        simpleList.setAdapter(arrayAdapter);
        ArrayList<Name> NameArrayList = new ArrayList<Name>();
        NameArrayList.add(new Name("Apple", R.drawable.image1, R.drawable.image2));
        NameArrayList.add(new Name("Balloon",R.drawable.image3,R.drawable.balloon));
        NameArrayList.add(new Name("Candle",R.drawable.image4,R.drawable.image5));
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MyViewAdapter adapter = new MyViewAdapter((AdapterView.OnItemClickListener) MainActivity5.this, NameArrayList.get(i));
                //ListView listView = findViewById(R.id.listview1);
                simpleList.setAdapter(adapter);
            }
        });
    }
}