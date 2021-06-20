package com.example.madlab02;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    StringBuffer exp = new StringBuffer();

    TextView etInput,txtResult;

    public void btn0(View view) {
        exp.append("0");
        etInput.setText(exp);

    }

    public void btn1(View view) {
        exp.append("1");
        etInput.setText(exp);

    }

    public void btn2(View view) {
        exp.append("2");
        etInput.setText(exp);

    }

    public void btn3(View view) {
        exp.append("3");
        etInput.setText(exp);

    }

    public void btn4(View view) {
        exp.append("4");
        etInput.setText(exp);

    }

    public void btn5(View view) {
        exp.append("5");
        etInput.setText(exp);

    }

    public void btn6(View view) {
        exp.append("6");
        etInput.setText(exp);
    }

    public void btn7(View view) {
        exp.append("7");
        etInput.setText(exp);

    }

    public void btn8(View view) {
        exp.append("8");
        etInput.setText(exp);

    }

    public void btn9(View view) {
        exp.append("9");

        etInput.setText(exp);
    }

    public void btnDot(View view) {
        exp.append(".");
        etInput.setText(exp);

    }

    public void btnMul(View view) {
        exp.append("*");
        etInput.setText(exp);

    }

    public void btnMod(View view) {
        exp.append("%");
        etInput.setText(exp);
    }

    public void btnDiv(View view) {
        exp.append("/");
        etInput.setText(exp);
    }

    public void btnAdd(View view) {
        exp.append("+");
        etInput.setText(exp);
    }

    public void btnSub(View view) {
        exp.append("-");
        etInput.setText(exp);

    }

    public void btnClear(View view) {
        exp.delete(0, exp.length());
        etInput.setText(exp);
        txtResult.setText("");
    }

    public void btnEqu(View view) {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("js");
            Double result = (Double) engine.eval(String.valueOf(exp));
            txtResult.setText(Double.toString(result));
        }
        catch (Exception e){
            txtResult.setText("Can't Evaluate");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInput = (TextView) findViewById(R.id.etInput);
        txtResult=(TextView)findViewById(R.id.txtResult);
    }
}