package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bdiv,bmul,beql,bdot,bclr,bsub;
    private EditText editText;
    double res;
    boolean add,mul,div,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        b0=findViewById(R.id.b0);
        bsub=findViewById(R.id.bsub);
        badd=findViewById(R.id.badd);
        bmul=findViewById(R.id.bmul);
        beql=findViewById(R.id.beql);
        bdiv=findViewById(R.id.bdiv);
        bdot=findViewById(R.id.bdot);
        bclr=findViewById(R.id.bclr);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText()+".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()==""){
                    editText.setText("");
                }
                else if(editText==null){
                    editText.setText("");
                }
                else{
                    add=true;
                    res=Double.parseDouble(editText.getText().toString());
                    editText.setText("");
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()==""){
                    editText.setText("");
                }
                else if(editText==null){
                    editText.setText("");
                }
                else{
                    div=true;
                    res=Double.parseDouble(editText.getText().toString());
                    editText.setText("");
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()==""){
                    editText.setText("");
                }
                else if(editText==null){
                    editText.setText("");
                }
                else{
                    mul=true;
                    res=Double.parseDouble(editText.getText().toString());
                    editText.setText("");
                }
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString()==""){
                    editText.setText("");
                }
                else if(editText==null){
                    editText.setText("");
                }
                else{
                    sub=true;
                    res=Double.parseDouble(editText.getText().toString());
                    editText.setText("");
                }
            }
        });
        beql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               double res2=Double.parseDouble(editText.getText().toString());
                if(editText.getText().toString()==""){
                    editText.setText("");
                }
                else {
                    if (add == true) {
                        double ans = res + res2;
                        editText.setText("" + ans);
                    }
                    if (mul == true) {
                        double ans = res * res2;
                        editText.setText("" + ans);
                    }
                    if (div == true) {
                        double ans = res / res2;
                        editText.setText("" + ans);
                    }
                    if (sub == true) {
                        double ans = res - res2;
                        editText.setText("" + ans);
                    }
                }
            }
        });
        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
    }
}