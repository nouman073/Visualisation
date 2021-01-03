package com.example.ncalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four, five, six, seven, eight, nine, zero, add, multiply, divide, subr, equal, point, clear;
    TextView txtv, txtvoperator, txtresult;
    boolean pointedit = false;

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
        point = findViewById(R.id.btnpoint);
        add = findViewById(R.id.btnaddsam);
        subr = findViewById(R.id.btnsub);
        multiply = findViewById(R.id.btnmultiply);
        divide = findViewById(R.id.btndivide);
        equal = findViewById(R.id.btnequal);
        clear = findViewById(R.id.btnclear);


        txtvoperator = findViewById(R.id.txtvoperator);
        txtresult = findViewById(R.id.txtresult);
        txtv = findViewById(R.id.txtv);

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });

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
                if (!pointedit) {
                    pointedit = true;
                    txtv.setText(txtv.getText() + ".");
                }

            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (moveValToResult()) {
                    txtvoperator.setText("+");
                }
            }
        });
        subr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (moveValToResult()) {
                    txtvoperator.setText("-");
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (moveValToResult()) {
                    txtvoperator.setText("*");
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (moveValToResult()) {
                    txtvoperator.setText("/");
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtvoperator.setText("");
                txtv.setText("");
                txtresult.setText("");
                pointedit = false;
            }

        });

    }

    private void calculate() {
        if (TextUtils.isEmpty(txtv.getText()) || TextUtils.isEmpty(txtresult.getText())) {

        }
        else {
            showResult(txtresult.getText().toString(), txtvoperator.getText().toString(), txtv.getText().toString());
        }
    }

    private void showResult(String val1, String operator, String val2) {
        char op = operator.charAt(0);
        switch (op) {
            case '+':
                addAndDisplayResult(val1, val2);
                break;
            case '-':
                subtractAndDisplayResult(val1, val2);
                break;
            case '*':
                multiplyAndDisplayResult(val1, val2);
                break;
            case '/':
                divideAndDisplayResult(val1, val2);
                break;
        }
    }

    private void divideAndDisplayResult(String val1, String val2) {
        double v1 = Double.parseDouble(val1);
        double v2 = Double.parseDouble(val2);
        if (v2 != 0) {
            showFinalResult(String.valueOf(v1/v2));
        }
    }

    private void showFinalResult(String s) {
        txtresult.setText(s);
        txtvoperator.setText("");
        txtv.setText("");
        pointedit = false;
    }

    private void multiplyAndDisplayResult(String val1, String val2) {
        double v1 = Double.parseDouble(val1);
        double v2 = Double.parseDouble(val2);
        showFinalResult(String.valueOf(v1*v2));
    }

    private void subtractAndDisplayResult(String val1, String val2) {
        double v1 = Double.parseDouble(val1);
        double v2 = Double.parseDouble(val2);
        showFinalResult(String.valueOf(v1-v2));
    }

    private void addAndDisplayResult(String val1, String val2) {
        double v1 = Double.parseDouble(val1);
        double v2 = Double.parseDouble(val2);
        showFinalResult(String.valueOf(v1+v2));
    }

    private boolean moveValToResult() {
        if (TextUtils.isEmpty(txtv.getText())) {
            return false;
        } else {
            txtresult.setText(txtv.getText().toString());
            txtv.setText("");
            return true;
        }
    }


}
