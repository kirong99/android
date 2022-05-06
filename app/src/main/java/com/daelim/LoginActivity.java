package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        String co_pwd = getIntent().getStringExtra("pwd");

        EditText id_2 = findViewById(R.id.id_2);
        EditText pwd_2 = findViewById(R.id.pwd_2);
        Button login = findViewById(R.id.login);
        CheckBox auto = findViewById(R.id.auto);
        SharedPreferences sp = getSharedPreferences("file",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.putString("id",id_2.getText().toString());
                ed.putString("pwd",pwd_2.getText().toString());
                ed.putBoolean("auto",auto.isChecked());
                ed.commit();
                if(co_pwd != null){
                    String id = sp.getString("id",id_2.getText().toString());
                    String pwd= sp.getString("pwd",co_pwd);
                    Intent intent = new Intent(LoginActivity.this, choigiryong.class);
                    intent.putExtra("id",id);
                    intent.putExtra("pwd",pwd);
                    startActivity(intent);
                    finish();
                }else{
                    String id = sp.getString("id",id_2.getText().toString());
                    String pwd= sp.getString("pwd",pwd_2.getText().toString());
                    Intent intent = new Intent(LoginActivity.this, choigiryong.class);
                    intent.putExtra("id",id);
                    intent.putExtra("pwd",pwd);
                    startActivity(intent);
                    finish();
                }

            }
        });

        if(sp.getBoolean("auto",false)){
            auto.setChecked(true);
            String id = sp.getString("id","");
            String pwd = sp.getString("pwd","");
            id_2.setText(id);
            pwd_2.setText(pwd);
        } else if(sp.getBoolean("auto",false)!=false){
            ed.clear();
        }


    }
}