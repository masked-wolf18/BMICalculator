package com.harsh.bmicalculator;

import static java.lang.Math.pow;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtWeight;
        EditText edtHeightFt;
        EditText edtHeightI = null;
        Button Btn;
        TextView Result;

        edtWeight = findViewById(R.id.edtWeight);
        edtHeightFt = findViewById(R.id.edtHeightI);
        Btn = findViewById(R.id.Btn);
        Result = findViewById(R.id.Result);

        EditText finalEdtHeightFt1 = edtHeightFt;
        Btn.setOnClickListener(view -> {
            int wt = Integer.parseInt(edtWeight.getText().toString());
            int ft = Integer.parseInt(finalEdtHeightFt1.getText().toString());
            assert false;
            int In = Integer.parseInt(edtHeightI.getText().toString());

            int totalIn = ft*12 + In;

            double totalCm = totalIn*2.53;

            double totalMt = totalCm/100;

            double bmi = wt/pow(totalMt,2);

            if (bmi>25){
                Result.setText("You're Overweight");
            }
            else if(bmi<18){
                Result.setText("You're Underweight");
            }else {
                Result.setText("You're Fit");
            }


        });

    }
}