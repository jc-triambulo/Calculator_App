package com.example.second;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText calculation, result;
    private String curr, res;

    private boolean decimalInserted, operatorInserted;

    private Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight,
            btnNine, btnDivide, btnTimes, btnMinus, btnAdd, btnDecimal, btnEquals, btnClear, btnDelete;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculation = (EditText) findViewById(R.id.btnCalculation);
        result = (EditText) findViewById(R.id.btnResult);

        curr = "";
        res = "";

        decimalInserted = false;
        operatorInserted = false;

        btnZero = (Button) findViewById(R.id.btnZero);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnTimes = (Button) findViewById(R.id.btnTimes);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnDecimal = (Button) findViewById(R.id.btnDecimal);
        btnEquals = (Button) findViewById(R.id.btnEquals);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnDelete = (Button) findViewById(R.id.btnDelete);


        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "0";
                displayOne();
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "1";
                displayOne();
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "2";
                displayOne();
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "3";
                displayOne();
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "4";
                displayOne();
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "5";
                displayOne();
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "6";
                displayOne();
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "7";
                displayOne();
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "8";
                displayOne();
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                curr = curr + "9";
                displayOne();
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(curr.isEmpty()){
                    curr = "0.";
                    decimalInserted = true;
                }

                if(decimalInserted == false){
                    curr = curr + ".";
                    decimalInserted = true;
                }
                displayOne();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
                displayOne();
                displayTwo();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                delete();
                displayOne();
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decimalInserted = false;

                if(!curr.isEmpty()){
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        delete();
                    }
                    if(operatorInserted == false){
                        curr = curr + " / ";
                        operatorInserted = true;
                    }
                }
                displayOne();
            }
        });

        btnTimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decimalInserted = false;

                if(!curr.isEmpty()){
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        delete();
                    }
                    if(operatorInserted == false){
                        curr = curr + " * ";
                        operatorInserted = true;
                    }
                }
                displayOne();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decimalInserted = false;

                if(!curr.isEmpty()){
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        delete();
                    }
                    if(operatorInserted == false){
                        curr = curr + " - ";
                        operatorInserted = true;
                    }
                }
                displayOne();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                decimalInserted = false;

                if(!curr.isEmpty()){
                    if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                        delete();
                    }
                    if(operatorInserted == false){
                        curr = curr + " + ";
                        operatorInserted = true;
                    }
                }
                displayOne();
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (operatorInserted == true && !curr.substring(curr.length()-1, curr.length()).equals(" ")){
                    String [] nums = curr.split(" ");
                    switch (nums [1].charAt(0)){
                        case '+':
                            res = Double.toString(Double.parseDouble(nums[0]) + Double.parseDouble(nums[2]));
                            break;

                        case '-':
                            res = Double.toString(Double.parseDouble(nums[0]) - Double.parseDouble(nums[2]));
                            break;

                        case '*':
                            res = Double.toString(Double.parseDouble(nums[0]) * Double.parseDouble(nums[2]));
                            break;

                        case '/':
                            res = Double.toString(Double.parseDouble(nums[0]) / Double.parseDouble(nums[2]));
                            break;
                    }
                    displayTwo();
                }
            }
        });


    }

    public void displayOne(){
        calculation.setText(curr);
    }

    public void displayTwo(){
        result.setText(res);
    }

    public void clear(){
        curr = "";
        res = "";
        decimalInserted = false;
        operatorInserted = false;
    }

    public void delete(){
        if(!curr.isEmpty()){

            if(curr.substring(curr.length()-1, curr.length()).equals(".")){
                decimalInserted = false;
            }

            if(curr.substring(curr.length()-1, curr.length()).equals(" ")){
                curr = curr.substring(0, curr.length()-3);
                operatorInserted = false;
            }else{
                curr = curr.substring(0, curr.length()-1);
            }
        }
    }

}
