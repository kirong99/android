package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ConfigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        String pwd_1 = getIntent().getStringExtra("pwd");

        SharedPreferences sp = getSharedPreferences("file",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();

        Button pwd = findViewById(R.id.pwd);
        Button nick = findViewById(R.id.nick);
        Button home = findViewById(R.id.home);
        Button main_home = findViewById(R.id.home_main);
        EditText ed_pwd = findViewById(R.id.ed_pwd);
        EditText ed_nick = findViewById(R.id.ed_nick);
        TextView or_pwd = findViewById(R.id.or_pwd);
        TextView or_nick = findViewById(R.id.or_nick);

        or_pwd.setText(pwd_1);
        pwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.putString("pwd",ed_pwd.getText().toString());
                ed.commit();
                String co_pwd = sp.getString("pwd",ed_pwd.getText().toString());
                or_pwd.setText(co_pwd);
                ed_pwd.setText("");
            }
        });
        nick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.putString("nick",ed_nick.getText().toString());
                ed.commit();
                String co_nick = sp.getString("nick",ed_nick.getText().toString());
                or_nick.setText(co_nick);
                ed_nick.setText("");
            }
        });
        main_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String co_nick = sp.getString("nick",ed_nick.getText().toString());
                Intent i = new Intent(ConfigActivity.this, choigiryong.class);
                i.putExtra("nick",co_nick);
                startActivity(i);
                finish();
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String co_pwd = sp.getString("nick",ed_pwd.getText().toString());
                Intent i = new Intent(ConfigActivity.this,LoginActivity.class);
                i.putExtra("nick",co_pwd);
                startActivity(i);
                finish();
            }
        });
    }
}