package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class choigiryong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String id;
        String pwd;
        String nickname;

        Button profile = findViewById(R.id.profile);
        Button pic = findViewById(R.id.pic);
        Button edu = findViewById(R.id.edu);
        Button gugu = findViewById(R.id.gugu);
        Button config = findViewById(R.id.config);
        TextView tv_value =findViewById(R.id.tv_value);

        id = getIntent().getStringExtra("id");
        pwd = getIntent().getStringExtra("pwd");
        nickname = getIntent().getStringExtra("nick");

        if(id!=null){
            tv_value.setText(id);
        }{
            tv_value.setText(nickname);
        }

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choigiryong.this,profileActivity.class);
                startActivity(i);
            }
        });

        pic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choigiryong.this,picActivity.class);
                startActivity(i);
            }
        });
        edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choigiryong.this,ListActivity.class);
                startActivity(i);
            }
        });
        gugu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choigiryong.this,guguActivity.class);
                startActivity(i);
            }
        });
        config.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(choigiryong.this,ConfigActivity.class);
                i.putExtra("pwd",pwd);
                startActivity(i);
            }
        });
    }
}