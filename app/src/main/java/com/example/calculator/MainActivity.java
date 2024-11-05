package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.name);
        e2=findViewById(R.id.marks1);
        e3=findViewById(R.id.marks2);
        e4=findViewById(R.id.marks3);
        e5=findViewById(R.id.total);
        e6=findViewById(R.id.avg);
        e7=findViewById(R.id.grade);

        btn1= findViewById(R.id.btn1);
        btn2= findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcul();

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });
    }

    public void calcul(){
        int m1,m2,m3,total;
        double avg;
        String grade;

        m1=Integer.parseInt(e2.getText().toString());
        m2=Integer.parseInt(e3.getText().toString());
        m3=Integer.parseInt(e4.getText().toString());

        total= m1+m2+m3;

        e5.setText(String.valueOf(total));

        avg= total/3;

        e6.setText(String.valueOf(avg));

        if(avg> 75){
            e7.setText("A");
        }
        else if (avg>65) {
            e7.setText("B");
        }
        else if (avg>55) {
            e7.setText("C");
        }
        else if (avg>45) {
            e7.setText("D");
        }
        else{
            e7.setText("FAIL");
        }
    }

    public void clear(){
        e1.setText("");
        e2.setText("");
        e3.setText("");
        e4.setText("");
        e5.setText("");
        e6.setText("");
        e7.setText("");
        e1.requestFocus();


    }
}