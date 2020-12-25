package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView  lblresult;
    Button vhod;
    EditText pass,login;
    final String log = "artem";
    final String pas = "1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.vhod = findViewById(R.id.vhod);
        this.lblresult = findViewById(R.id.lblresult);
        this.login = findViewById(R.id.login);
        this.pass = findViewById(R.id.password);
        vhod.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String s1 = login.getText().toString();
        String s2 = pass.getText().toString();
        if (s1.equals(log) && s2.equals(pas)){
            lblresult.setText("Верно");
        }
        else{
            lblresult.setText("Вы ошиблись в логине или пароле");
            login.setText(null);
            pass.setText(null);
        }
    }
}