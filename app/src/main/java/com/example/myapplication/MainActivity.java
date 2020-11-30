package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text;
    Button summ;
    EditText ed1,ed2,ed3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        summ = findViewById(R.id.sum);

        text = findViewById(R.id.text);
        ed1 = findViewById(R.id.number1);
        ed2= findViewById(R.id.number2);
        ed3= findViewById(R.id.number3);
        summ.setOnClickListener(this);

    }

    @Override
    public void onClick (View v) {
        String t1 = ed1.getText().toString();
        String t2 = ed2.getText().toString();
        String t3 = ed3.getText().toString();
        double a = Integer.parseInt(t1);
        double b = Integer.parseInt(t2);
        double c = Integer.parseInt(t3);
        if (a==0){
            text.setText("Error");
        }
        double D = b*b - 4*c*a;
        if (D<0){
            text.setText("Error");
        }
        double x1 = ((-b+Math.sqrt(D))/(2*a));
        double x2= ((-b-Math.sqrt(D))/(2*a));
        if (D==0){
            text.setText(String.valueOf(x1=-b/2*a));
        } else{
            text.setText(String.valueOf(x1) + " "+ " "+ String.valueOf(x2));
        }


    }
}