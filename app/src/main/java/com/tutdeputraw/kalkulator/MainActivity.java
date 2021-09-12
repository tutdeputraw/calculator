package com.tutdeputraw.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView formula;
    private TextView result;
    private ArrayList<String> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formula = findViewById(R.id.tv_number);
        result = findViewById(R.id.tv_result);
    }

    public void clickCalculate(View view) {
    }

    public void clickAc(View view) {
        list.clear();
        convertArrayToString();
    }

    public void clickDel(View view) {
        list.remove(list.size() - 1);
        convertArrayToString();
    }

    public void clickPlusMinus(View view) {
        list.add("(- ");
        convertArrayToString();
    }

    public void clickDivision(View view) {
        list.add(" / ");
        convertArrayToString();
    }

    public void clickX(View view) {
        list.add(" * ");
        convertArrayToString();
    }

    public void clickMinus(View view) {
        list.add(" - ");
        convertArrayToString();
    }

    public void clickPlus(View view) {
        list.add(" + ");
        list.get(list.size()-1);
        convertArrayToString();
    }

    public void clickDot(View view) {
        list.add(".");
        convertArrayToString();
    }

    public void clickPercent(View view) {
        list.add(" % ");
        convertArrayToString();
    }

    public void click0(View view) {
        list.add("0");
        convertArrayToString();
    }

    public void click1(View view) {
        list.add("1");
        convertArrayToString();
    }

    public void click2(View view) {
        list.add("2");
        convertArrayToString();
    }

    public void click3(View view) {
        list.add("3");
        convertArrayToString();
    }

    public void click4(View view) {
        list.add("4");
        convertArrayToString();
    }

    public void click5(View view) {
        list.add("5");
        convertArrayToString();
    }

    public void click6(View view) {
        list.add("6");
        convertArrayToString();
    }

    public void click7(View view) {
        list.add("7");
        convertArrayToString();
    }

    public void click8(View view) {
        list.add("8");
        convertArrayToString();
    }

    public void click9(View view) {
        list.add("9");
        convertArrayToString();
    }

    private void convertArrayToString() {
        formula.setText(TextUtils.join("", list));
    }
}