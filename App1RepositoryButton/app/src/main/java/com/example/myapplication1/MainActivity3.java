package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    ImageView alpha;
    ImageView pic;
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        alpha = findViewById(R.id.alpha);
        pic = findViewById(R.id.pic);
        name = findViewById(R.id.name);

        Intent intent = getIntent();
        String letter = intent.getStringExtra("alphabet");
        if (letter.equals("A")){
            name.setText("Apple");
            alpha.setImageResource(R.drawable.image1);
            pic.setImageResource(R.drawable.image2);
        }
        if (letter.equals("B")){
            name.setText("Balloon");
            alpha.setImageResource(R.drawable.image3);
            pic.setImageResource(R.drawable.balloon);
        }
        if (letter.equals("C")){
            name.setText("Candle");
            alpha.setImageResource(R.drawable.image5);
            pic.setImageResource(R.drawable.image6);
        }
        if (letter.equals("D")){
            name.setText("Duck");
            alpha.setImageResource(R.drawable.image7);
            pic.setImageResource(R.drawable.image8);
        }
        if (letter.equals("E")){
            name.setText("Elephant");
            alpha.setImageResource(R.drawable.image9);
            pic.setImageResource(R.drawable.elephant);
        }
        if (letter.equals("F")){
            name.setText("Flag");
            alpha.setImageResource(R.drawable.image10);
            pic.setImageResource(R.drawable.flag);
        }
        if (letter.equals("G")){
            name.setText("Gun");
            alpha.setImageResource(R.drawable.image11);
            pic.setImageResource(R.drawable.gun);
        }
        if (letter.equals("H")){
            name.setText("Hen");
            alpha.setImageResource(R.drawable.image12);
            pic.setImageResource(R.drawable.hen);
        }
        if (letter.equals("I")){
            name.setText("Iglo");
            alpha.setImageResource(R.drawable.image13);
            pic.setImageResource(R.drawable.iglo);
        }
        if (letter.equals("J")){
            name.setText("Jug");
            alpha.setImageResource(R.drawable.image14);
            pic.setImageResource(R.drawable.jug);
        }
        if (letter.equals("K")){
            name.setText("Kettle");
            alpha.setImageResource(R.drawable.image15);
            pic.setImageResource(R.drawable.kettle);
        }
        if (letter.equals("L")){
            name.setText("Lemon");
            alpha.setImageResource(R.drawable.image16);
            pic.setImageResource(R.drawable.lemon);
        }
        if (letter.equals("M")){
            name.setText("Mango");
            alpha.setImageResource(R.drawable.image17);
            pic.setImageResource(R.drawable.mango);
        }
        if (letter.equals("N")){
            name.setText("Nest");
            alpha.setImageResource(R.drawable.image18);
            pic.setImageResource(R.drawable.nest);
        }
        if (letter.equals("O")){
            name.setText("Orange");
            alpha.setImageResource(R.drawable.image19);
            pic.setImageResource(R.drawable.orange);
        }
        if (letter.equals("P")){
            name.setText("Parrot");
            alpha.setImageResource(R.drawable.image20);
            pic.setImageResource(R.drawable.parrot);
        }
        if (letter.equals("Q")){
            name.setText("Queen");
            alpha.setImageResource(R.drawable.image21);
            pic.setImageResource(R.drawable.queen);
        }
        if (letter.equals("R")){
            name.setText("Rainbow");
            alpha.setImageResource(R.drawable.image22);
            pic.setImageResource(R.drawable.rainbow);
        }
        if (letter.equals("S")){
            name.setText("Sun");
            alpha.setImageResource(R.drawable.image23);
            pic.setImageResource(R.drawable.sun);
        }
        if (letter.equals("T")){
            name.setText("Tree");
            alpha.setImageResource(R.drawable.image24);
            pic.setImageResource(R.drawable.tree);
        }
        if (letter.equals("U")){
            name.setText("Umbrella");
            alpha.setImageResource(R.drawable.image25);
            pic.setImageResource(R.drawable.umbrella);
        }
        if (letter.equals("V")){
            name.setText("Van");
            alpha.setImageResource(R.drawable.image26);
            pic.setImageResource(R.drawable.van);
        }
        if (letter.equals("W")){
            name.setText("Watermelon");
            alpha.setImageResource(R.drawable.image27);
            pic.setImageResource(R.drawable.watermelon);
        }
        if (letter.equals("X")){
            name.setText("X-Ray");
            alpha.setImageResource(R.drawable.image28);
            pic.setImageResource(R.drawable.xray);
        }
        if (letter.equals("Y")){
            name.setText("Yoyo");
            alpha.setImageResource(R.drawable.image29);
            pic.setImageResource(R.drawable.yoyo);
        }
        if (letter.equals("Z")){
            name.setText("Zebra");
            alpha.setImageResource(R.drawable.image30);
            pic.setImageResource(R.drawable.zebra);
        }


    }
}