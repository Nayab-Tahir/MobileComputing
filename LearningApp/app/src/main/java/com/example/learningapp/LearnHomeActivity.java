package com.example.learningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LearnHomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI, btnJ, btnK, btnL, btnM, btnN, btnO, btnP, btnQ,
            btnR, btnS, btnT, btnU, btnV, btnW, btnX, btnY, btnZ;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_home);

        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnC = findViewById(R.id.btnC);
        btnD = findViewById(R.id.btnD);
        btnE = findViewById(R.id.btnE);
        btnF = findViewById(R.id.btnF);
        btnG = findViewById(R.id.btnG);
        btnH = findViewById(R.id.btnH);
        btnI = findViewById(R.id.btnI);
        btnJ = findViewById(R.id.btnJ);
        btnK = findViewById(R.id.btnK);
        btnL = findViewById(R.id.btnL);
        btnM = findViewById(R.id.btnM);
        btnN = findViewById(R.id.btnN);
        btnO = findViewById(R.id.btnO);
        btnP = findViewById(R.id.btnP);
        btnQ = findViewById(R.id.btnQ);
        btnR = findViewById(R.id.btnR);
        btnS = findViewById(R.id.btnS);
        btnT = findViewById(R.id.btnT);
        btnU = findViewById(R.id.btnU);
        btnV = findViewById(R.id.btnV);
        btnW = findViewById(R.id.btnW);
        btnX = findViewById(R.id.btnX);
        btnY = findViewById(R.id.btnY);
        btnZ = findViewById(R.id.btnZ);

        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnD.setOnClickListener(this);
        btnE.setOnClickListener(this);
        btnF.setOnClickListener(this);
        btnG.setOnClickListener(this);
        btnH.setOnClickListener(this);
        btnI.setOnClickListener(this);
        btnJ.setOnClickListener(this);
        btnK.setOnClickListener(this);
        btnL.setOnClickListener(this);
        btnM.setOnClickListener(this);
        btnN.setOnClickListener(this);
        btnO.setOnClickListener(this);
        btnP.setOnClickListener(this);
        btnQ.setOnClickListener(this);
        btnR.setOnClickListener(this);
        btnS.setOnClickListener(this);
        btnT.setOnClickListener(this);
        btnU.setOnClickListener(this);
        btnV.setOnClickListener(this);
        btnW.setOnClickListener(this);
        btnX.setOnClickListener(this);
        btnY.setOnClickListener(this);
        btnZ.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(LearnHomeActivity.this, LetterImage.class);
        intent.putExtra("Letter", ((Button) view).getText());
        startActivity(intent);
    }
}
