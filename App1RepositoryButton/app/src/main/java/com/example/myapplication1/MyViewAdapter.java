package com.example.myapplication1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyViewAdapter extends ArrayAdapter<Name> {
    public MyViewAdapter(@NonNull AdapterView.OnItemClickListener context, Name nameItem) {
        super((Context) context, 0, (List<Name>) nameItem);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Name name1 = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.name_view, parent, false);
        TextView textViewName =  convertView.findViewById(R.id.textViewName);
        ImageView imageView1 = convertView.findViewById(R.id.imageAlphabet);
        ImageView imageView2 = convertView.findViewById(R.id.imageName);
        textViewName.setText(name1.name);
        imageView1.setImageResource(name1.imageAlphabet);
        imageView2.setImageResource(name1.image);
        return convertView;
    }
}
