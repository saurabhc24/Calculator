package com.example.a1cr18is133_calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnadd,btnsub,btnmul,btndiv,btnmod,btnac,btneql,btndot;
    TextView calculation;
    TextView result;
    TextView ed1;

    Float op1,op2;

    boolean Add, Sub, Mul, Div, Mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking the buttons and textview
        btn0 = (Button)findViewById(R.id.btn_0);
        btn1 = (Button)findViewById(R.id.btn_1);
        btn2 = (Button)findViewById(R.id.btn_2);
        btn3 = (Button)findViewById(R.id.btn_3);
        btn4 = (Button)findViewById(R.id.btn_4);
        btn5 = (Button)findViewById(R.id.btn_5);
        btn6 = (Button)findViewById(R.id.btn_6);
        btn7 = (Button)findViewById(R.id.btn_7);
        btn8 = (Button)findViewById(R.id.btn_8);
        btn9 = (Button)findViewById(R.id.btn_9);

        btnadd = (Button)findViewById(R.id.btn_plus);
        btnsub = (Button)findViewById(R.id.btn_sub);
        btnmul = (Button)findViewById(R.id.btn_mul);
        btndiv = (Button)findViewById(R.id.btn_div);
        btnmod = (Button)findViewById(R.id.mod);

        btndot = (Button)findViewById(R.id.btn_dot);
        btnac = (Button)findViewById(R.id.ac);
        btneql = (Button)findViewById(R.id.btn_eql);

        ed1 = (TextView) findViewById(R.id.ed1);
        calculation = (TextView) findViewById(R.id.calc);
        result = (TextView) findViewById(R.id.result);

        //defining the button functionalities
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.setText(calculation.getText()+"0");
                ed1.setText(ed1.getText()+"0");

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.setText(calculation.getText()+"1");
                ed1.setText(ed1.getText()+"1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.setText(calculation.getText()+"2");
                ed1.setText(ed1.getText()+"2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.setText(calculation.getText()+"3");
                ed1.setText(ed1.getText()+"3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.setText(calculation.getText()+"4");
                ed1.setText(ed1.getText()+"4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.setText(calculation.getText()+"5");
                ed1.setText(ed1.getText()+"5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.setText(calculation.getText()+"6");
                ed1.setText(ed1.getText()+"6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.setText(calculation.getText()+"7");
                ed1.setText(ed1.getText()+"7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.setText(calculation.getText()+"8");
                ed1.setText(ed1.getText()+"8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculation.setText(calculation.getText()+"9");
                ed1.setText(ed1.getText()+"9");

            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calculation.setText(calculation.getText()+".");
                ed1.setText(ed1.getText()+".");

            }
        });
        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                calculation.setText("");
                result.setText("");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //preventing "+" input if the textview is empty
                if(ed1.equals("")){
                    ed1.setText("");
                }
                else{
                    op1 = Float.parseFloat(ed1.getText()+"");
                    Add = true;
                    ed1.setText(null);
                    calculation.setText(calculation.getText()+"+");
                }
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //preventing "-" input if the textview is empty
                if(ed1.equals("")){
                    ed1.setText("");
                }
                else{
                    op1 = Float.parseFloat(ed1.getText()+"");
                    Sub = true;
                    ed1.setText(null);
                    calculation.setText(calculation.getText()+"-");
                }
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //preventing "*" input if the textview is empty
                if(ed1 == null){
                    ed1.setText("");
                }
                else{
                    op1 = Float.parseFloat(ed1.getText()+"");
                    Mul = true;
                    ed1.setText(null);
                    calculation.setText(calculation.getText()+"×");
                }
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //preventing "/" input if the textview is empty
                if(ed1 == null){
                    ed1.setText("");
                }
                else{
                    op1 = Float.parseFloat(ed1.getText()+"");
                    Div = true;
                    ed1.setText(null);
                    calculation.setText(calculation.getText()+"÷");
                }
            }
        });

        btnmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //preventing "%" input if the textview is empty
                if(ed1 == null){
                    ed1.setText("");
                }
                else{
                    op1 = Float.parseFloat(ed1.getText()+"");
                    Mod = true;
                    ed1.setText(null);
                    calculation.setText(calculation.getText()+"%");
                }
            }
        });

        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //storing the op2 value
                op2 = Float.parseFloat(ed1.getText()+"");

                if(Add ==true){
                    result.setText(op1+op2+"");
                    Add = false;
                }

                if(Sub ==true){
                    result.setText(op1-op2+"");
                    Sub = false;
                }

                if(Mul == true){
                    result.setText(op1*op2+"");
                    Mul = false;
                }

                if(Div == true){
                    result.setText(op1/op2+"");
                    Div = false;
                }

                if(Mod == true){
                    result.setText(op1%op2+"");
                    Mod = false;
                }
            }
        });


    }
}