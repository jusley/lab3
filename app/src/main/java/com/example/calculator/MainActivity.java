package com.example.calculator;
import java.lang.*;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button erase;
    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button zero;
    Button AC;
    Button power;
    Button prctg;
    Button division;
    Button minus;
    Button plus;
    Button dot;
    Button equals;
    Button mult;
    TextView input;
    String iNput;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionbar = getSupportActionBar();
        actionbar.setTitle("CALCULATOR");
        actionbar.setBackgroundDrawable(Drawable.createFromPath("@drawable/layout4"));

        erase = findViewById(R.id.erase_et);
        one = findViewById(R.id.one_et);
        two = findViewById(R.id.two_et);
        three = findViewById(R.id.three_et);
        four = findViewById(R.id.four_et);
        five = findViewById(R.id.five_et);
        six = findViewById(R.id.six_et);
        seven = findViewById(R.id.seven_et);
        eight = findViewById(R.id.eight_et);
        nine = findViewById(R.id.nine_et);
        zero = findViewById(R.id.zero_et);
        AC = findViewById(R.id.AC_ET);
        power = findViewById(R.id.power_et);
        prctg = findViewById(R.id.prctg_et);
        division = findViewById(R.id.division_et);
        minus = findViewById(R.id.minus_et);
        plus = findViewById(R.id.plus_et);
        dot = findViewById(R.id.dot_et);
        equals = findViewById(R.id.equals_et);
        mult = findViewById(R.id.mult_et);
        input = findViewById(R.id.input_et);


        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textnimus1 = iNput.substring(0, iNput.length() - 1);
                iNput = textnimus1;
                input.setText(iNput);

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iNput==null){
                    iNput="";
                }
                iNput += "1";
                input.setText(iNput);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iNput==null){
                    iNput="";
                }
                iNput += "2";
                input.setText(iNput);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iNput==null){
                    iNput="";
                }
                iNput += "3";
                input.setText(iNput);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iNput==null){
                    iNput="";
                }
                iNput += "4";
                input.setText(iNput);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iNput==null){
                    iNput="";
                }
                iNput += "5";
                input.setText(iNput);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iNput==null){
                    iNput="";
                }
                iNput += "6";
                input.setText(iNput);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iNput==null){
                    iNput="";
                }
                iNput += "7";
                input.setText(iNput);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iNput==null){
                    iNput="";
                }
                iNput += "8";
                input.setText(iNput);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iNput==null){
                    iNput="";
                }
                iNput += "9";
                input.setText(iNput);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iNput==null){
                    iNput="";
                }
                iNput += "0";
                input.setText(iNput);
            }
        });

        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iNput = "";
                input.setText(iNput);
            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                if(iNput==null){
                    iNput="";
                }
                iNput += "^";
                input.setText(iNput);
            }
        });

        prctg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double prec = Double.parseDouble(iNput) / 100;
                iNput = prec+"";
                if(iNput==null){
                    iNput="";
                }
                input.setText(iNput);
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                if(iNput==null){
                    iNput="";
                }
                iNput += "/";
                input.setText(iNput);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                if(iNput==null){
                    iNput="";
                }
                iNput += "-";
                input.setText(iNput);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                if(iNput==null){
                    iNput="";
                }
                else{
                    iNput += "+";
                }
                input.setText(iNput);

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(iNput==null){
                    iNput="";
                }
                iNput += ".";
                input.setText(iNput);
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                input.setText(iNput);
            }
        });
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate();
                if(iNput==null){
                    iNput="";
                }
                iNput += "*";
                input.setText(iNput);
            }
        });


    }


    public void calculate() {
        if (iNput.split("\\*").length == 2) {
            String number[] = iNput.split("\\*");
            try {
                double response = Double.parseDouble(number[0]) * Double.parseDouble(number[1]);
                iNput = response+"";
            } catch (Exception e) {

            }

        }
        if (iNput.split("/").length == 2) {
            String number[] = iNput.split("/");
            try {
                double quot = Double.parseDouble(number[0]) / Double.parseDouble(number[1]);
                iNput = quot+"";
            } catch (Exception e) {

            }

        }
        if (iNput.split("\\+").length == 2) {
            String number[] = iNput.split("\\+");
            try {
                double sum = Double.parseDouble(number[0]) + Double.parseDouble(number[1]);
                iNput = sum+"";
            } catch (Exception e) {

            }

        }
        if (iNput.split("-").length == 2) {
            String number[] = iNput.split("-");
            if (number[0].equals("") && number.length == 2) {
                number[0] = 0 + "";
            }
            try {
                double diff = Double.parseDouble(number[0]) - Double.parseDouble(number[1]);
                iNput = diff+"";
            } catch (Exception e) {

            }

        }
            if (iNput.split("\\^").length == 2) {
                String number[] = iNput.split("\\^");
                try {
                    double pow = Math.pow(Double.parseDouble(number[0]), Double.parseDouble(number[1]));
                    iNput = pow+"";
                } catch (Exception e) {

                }

            }
            String noZeros[] = iNput.split("\\.");
            if (noZeros.length > 1) {
                if (noZeros[1].equals("0")) {
                    iNput = noZeros[0];
                }
            }
            input.setText(iNput);
        }

    }