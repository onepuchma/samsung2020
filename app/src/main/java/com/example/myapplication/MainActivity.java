package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView lblresult;
    Button vhod;
    EditText pass,log;
     final String password = "1234";
     final String login = "artem";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lblresult = findViewById(R.id.text);
       pass = findViewById(R.id.password);
        log = findViewById(R.id.login);
        vhod= findViewById(R.id.vhod);
        vhod.setOnClickListener(this);

    }

    @Override
    public void onClick (View v) {
        String s1 = pass.getText().toString();
        String s2 = log.getText().toString();
        if (s1.equals(password) && s2.equals(login)){
            lblresult.setText("Верно");
        }
        else {
            lblresult.setText("Вы ошиблись в логине или пароле");
            log.setText(null);
            pass.setText (null);
        }


    }
}