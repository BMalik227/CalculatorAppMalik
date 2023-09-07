package com.example.calculatorappmalik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String showEquation ="";
    public void button1Clicked(){
        showEquation+="1";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
    public void button2Clicked(){
        showEquation+="2";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
    public void button3Clicked(){
        showEquation+="3";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
    public void button4Clicked(View v){
        showEquation+="4";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
    public void button5Clicked(){
        showEquation+="5";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
    public void button6Clicked(){
        showEquation+="6";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
    public void button7Clicked(){
        showEquation+="7";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
    public void button8Clicked(){
        showEquation+="8";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
    public void button0Clicked(){
        showEquation+="0";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
    public void buttonPlusClicked(){
        showEquation+="+";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
    public void buttonMinusClicked(){
        showEquation+="-";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
    public void buttonDivideClicked(View v){
        showEquation+="÷";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
    public void buttonMultiplyClicked(){
        showEquation+="x";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
    public void buttonEqualClicked(){
        showEquation+="9";
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
}