package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LetterImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_image);

        ImageView img;
        img = findViewById(R.id.imageView);

        TextView letterName;
        letterName = findViewById(R.id.letterName);

        Intent intent = getIntent();
        String letter = intent.getStringExtra("Letter");

        letterName.setText(letter);

        switch (letter){
            case "A":
                img.setImageResource(R.drawable.letter_a);
                break;
            case "B":
                img.setImageResource(R.drawable.letter_b);
                break;
            case "C":
                img.setImageResource(R.drawable.letter_c);
                break;
            case "D":
                img.setImageResource(R.drawable.letter_d);
                break;
            case "E":
                img.setImageResource(R.drawable.letter_e);
                break;
            case "F":
                img.setImageResource(R.drawable.letter_f);
                break;
            case "G":
                img.setImageResource(R.drawable.letter_g);
                break;
            case "H":
                img.setImageResource(R.drawable.letter_h);
                break;
            case "I":
                img.setImageResource(R.drawable.letter_i);
                break;
            case "J":
                img.setImageResource(R.drawable.letter_j);
                break;
            case "K":
                img.setImageResource(R.drawable.letter_k);
                break;
            case "L":
                img.setImageResource(R.drawable.letter_l);
                break;
            case "M":
                img.setImageResource(R.drawable.letter_m);
                break;
            case "N":
                img.setImageResource(R.drawable.letter_n);
                break;
            case "O":
                img.setImageResource(R.drawable.letter_o);
                break;
            case "P":
                img.setImageResource(R.drawable.letter_p);
                break;
            case "Q":
                img.setImageResource(R.drawable.letter_q);
                break;
            case "R":
                img.setImageResource(R.drawable.letter_r);
                break;
            case "S":
                img.setImageResource(R.drawable.letter_s);
                break;
            case "T":
                img.setImageResource(R.drawable.letter_t);
                break;
            case "U":
                img.setImageResource(R.drawable.letter_u);
                break;
            case "V":
                img.setImageResource(R.drawable.letter_v);
                break;
            case "W":
                img.setImageResource(R.drawable.letter_w);
                break;
            case "X":
                img.setImageResource(R.drawable.letter_x);
                break;
            case "Y":
                img.setImageResource(R.drawable.letter_y);
                break;
            case "Z":
                img.setImageResource(R.drawable.letter_z);
                break;

        }
    }
}