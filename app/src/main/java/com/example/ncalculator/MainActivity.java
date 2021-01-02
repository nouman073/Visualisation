package com.example.ncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero, add, multiply, divide, subr, equal, point;
    TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.btnone);
        two = findViewById(R.id.btntwo);
        three = findViewById(R.id.btnthree);
        four = findViewById(R.id.btfour);
        five = findViewById(R.id.btnfive);
        six = findViewById(R.id.btnsix);
        seven = findViewById(R.id.btnsevan);
        eight = findViewById(R.id.btneit);
        nine = findViewById(R.id.btnnine);
        zero = findViewById(R.id.btnzero);
        txtv = findViewById(R.id.txtv);
        add = findViewById(R.id.btnaddsam);
        subr = findViewById(R.id.btnsub);
        multiply = findViewById(R.id.btnmultiply);
        divide = findViewById(R.id.btndivide);
        equal=findViewById(R.id.btnequal);


        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "0");
            }
        });

        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + ".");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "+");
            }
        });
        subr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "-");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "2");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtv.setText(txtv.getText() + "2");
            }
        });

    }
}
