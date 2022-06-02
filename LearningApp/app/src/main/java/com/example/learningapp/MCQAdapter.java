package com.example.learningapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MCQAdapter extends ArrayAdapter<MCQ>{
    public MCQAdapter(@NonNull Context context, ArrayList<MCQ> mcqs) {
        super(context, 0, mcqs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        MCQ mcq = getItem(position);

        LayoutInflater inflater = LayoutInflater.from(getContext());
        convertView = inflater.inflate(R.layout.mcq_layout, parent, false);

        ImageView mcqImage = convertView.findViewById(R.id.mcqImage);
        RadioButton opt1 = convertView.findViewById(R.id.opt1);
        RadioButton opt2 = convertView.findViewById(R.id.opt2);
        RadioButton opt3 = convertView.findViewById(R.id.opt3);
        RadioButton opt4 = convertView.findViewById(R.id.opt4);

        mcqImage.setImageResource(mcq.imageID);
        opt1.setText(mcq.option1);
        opt2.setText(mcq.option2);
        opt3.setText(mcq.option3);
        opt4.setText(mcq.option4);

        opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mcq.correctOpt == 1)
                    mcq.isCorrect = true;
                else
                    mcq.isCorrect = false;
            }
        });
        opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mcq.correctOpt == 2)
                    mcq.isCorrect = true;
                else
                    mcq.isCorrect = false;
            }
        });
        opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mcq.correctOpt == 3)
                    mcq.isCorrect = true;
                else
                    mcq.isCorrect = false;
            }
        });
        opt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mcq.correctOpt == 4)
                    mcq.isCorrect = true;
                else
                    mcq.isCorrect = false;
            }
        });

        return convertView;
    }
}
