package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class TestHomeActivity2 extends AppCompatActivity {
    ListView listView;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_home2);
        ArrayList<MCQ> mcqs = new ArrayList<MCQ>();

        int img_list[] = {R.drawable.letter_a, R.drawable.letter_b, R.drawable.letter_c, R.drawable.letter_d, R.drawable.letter_e, R.drawable.letter_f, R.drawable.letter_g, R.drawable.letter_h, R.drawable.letter_i, R.drawable.letter_j, R.drawable.letter_k, R.drawable.letter_l,
                R.drawable.letter_m, R.drawable.letter_n, R.drawable.letter_o, R.drawable.letter_p, R.drawable.letter_q, R.drawable.letter_r, R.drawable.letter_s, R.drawable.letter_t, R.drawable.letter_u, R.drawable.letter_v, R.drawable.letter_w, R.drawable.letter_x, R.drawable.letter_y, R.drawable.letter_z};
        Random rand = new Random();
        for (int i=0; i<26; i++) {
            int imgNo = rand.nextInt(26);
            int mcqNo = imgNo + 65;
            String corr = Character.toString((char) (mcqNo));
            int corrNo = rand.nextInt(4) + 1;

            if (corr.equals("A") || corr.equals("B") || corr.equals("C")) {
                switch (corrNo) {
                    case 1:
                        mcqs.add(new MCQ(img_list[imgNo], corr, Character.toString((char) (mcqNo + 1)), Character.toString((char) (mcqNo + 2)), Character.toString((char) (mcqNo + 3)), corrNo));
                        break;
                    case 2:
                        mcqs.add(new MCQ(img_list[imgNo], Character.toString((char) (mcqNo + 1)), corr, Character.toString((char) (mcqNo + 2)), Character.toString((char) (mcqNo + 3)), corrNo));
                        break;
                    case 3:
                        mcqs.add(new MCQ(img_list[imgNo], Character.toString((char) (mcqNo + 1)), Character.toString((char) (mcqNo + 2)), corr, Character.toString((char) (mcqNo + 3)), corrNo));
                        break;
                    case 4:
                        mcqs.add(new MCQ(img_list[imgNo], Character.toString((char) (mcqNo + 1)), Character.toString((char) (mcqNo + 2)), Character.toString((char) (mcqNo + 3)), corr, corrNo));
                        break;
                }
            } else {
                switch (corrNo) {
                    case 1:
                        mcqs.add(new MCQ(img_list[imgNo], corr, Character.toString((char) (mcqNo - 1)), Character.toString((char) (mcqNo - 2)), Character.toString((char) (mcqNo - 3)), corrNo));
                        break;
                    case 2:
                        mcqs.add(new MCQ(img_list[imgNo], Character.toString((char) (mcqNo - 1)), corr, Character.toString((char) (mcqNo - 2)), Character.toString((char) (mcqNo - 3)), corrNo));
                        break;
                    case 3:
                        mcqs.add(new MCQ(img_list[imgNo], Character.toString((char) (mcqNo - 1)), Character.toString((char) (mcqNo - 2)), corr, Character.toString((char) (mcqNo - 3)), corrNo));
                        break;
                    case 4:
                        mcqs.add(new MCQ(img_list[imgNo], Character.toString((char) (mcqNo - 1)), Character.toString((char) (mcqNo - 2)), Character.toString((char) (mcqNo - 3)), corr, corrNo));
                        break;
                }
            }
        }

        listView = findViewById(R.id.listView);

        MCQAdapter mcqAdapter = new MCQAdapter(this, mcqs);
        listView.setAdapter(mcqAdapter);

        submit = findViewById(R.id.submitTest);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int count = 0;
                for (MCQ mcq: mcqs) {
                    if(mcq.isCorrect)
                        count ++;
                }
                Intent intent = new Intent(TestHomeActivity2.this, TestResult.class);
                intent.putExtra("count", count);
                startActivity(intent);
            }
        });
    }


}