package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class guguActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gugu);

        Button dan1 = findViewById(R.id.dan1);
        Button dan2 = findViewById(R.id.dan2);
        Button dan3 = findViewById(R.id.dan3);
        Button dan4 = findViewById(R.id.dan4);
        Button dan5 = findViewById(R.id.dan5);
        Button dan6 = findViewById(R.id.dan6);
        Button dan7 = findViewById(R.id.dan7);
        Button dan8 = findViewById(R.id.dan8);
        Button dan9 = findViewById(R.id.dan9);

        TextView res = findViewById(R.id.res);

        dan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer sb = new StringBuffer();
                for(int i = 1; i <=9;i++){
                    sb.append(1 + "x" + i + "=" + (1*i)+"\n");
                }
                res.setText(sb.toString());
            }
        });
        dan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer sb = new StringBuffer();
                for(int i = 1; i <=9;i++){
                    sb.append(2 + "x" + i + "=" + (2*i)+"\n");
                }
                res.setText(sb.toString());
            }
        });
        dan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer sb = new StringBuffer();
                for(int i = 1; i <=9;i++){
                    sb.append(3 + "x" + i + "=" + (3*i)+"\n");
                }
                res.setText(sb.toString());
            }
        });
        dan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer sb = new StringBuffer();
                for(int i = 1; i <=9;i++){
                    sb.append(4 + "x" + i + "=" + (4*i)+"\n");
                }
                res.setText(sb.toString());
            }
        });
        dan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer sb = new StringBuffer();
                for(int i =1; i <=9;i++){
                    sb.append(5 + "x" + i + "=" + (5*i)+"\n");
                }
                res.setText(sb.toString());
            }
        });
        dan6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer sb = new StringBuffer();
                for(int i = 1; i <=9;i++){
                    sb.append(6 + "x" + i + "=" + (6*i)+"\n");
                }
                res.setText(sb.toString());
            }
        });
        dan7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer sb = new StringBuffer();
                for(int i = 1; i <=9;i++){
                    sb.append(7 + "x" + i + "=" + (7*i)+"\n");
                }
                res.setText(sb.toString());
            }
        });
        dan8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer sb = new StringBuffer();
                for(int i = 1; i <=9;i++){
                    sb.append(8 + "x" + i + "=" + (8*i)+"\n");
                }
                res.setText(sb.toString());
            }
        });
        dan9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuffer sb = new StringBuffer();
                for(int i = 1; i <=9;i++){
                    sb.append(9 + "x" + i + "=" + (9*i)+"\n");
                }
                res.setText(sb.toString());
            }
        });
    }
}