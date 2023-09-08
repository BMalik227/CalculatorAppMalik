package com.example.calculatorappmalik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    String showEquation ="";

    public void buttonClicked(View v){
        if(v.getId() == R.id.button3){
            showEquation+="1 ";
        }
        if(v.getId() == R.id.buttonDivide){
            showEquation+="÷ ";
        }
        if(v.getId() == R.id.button13){
            showEquation+="4 ";
        }
        if(v.getId() == R.id.button24){
            double answer = 0;
            String temp = showEquation;
            Log.i("denna", temp);
            if(temp.indexOf("÷") >= 0){
                if (temp.indexOf("÷") >= 2){
                    String temp1 = temp.substring(temp.indexOf("÷") - 2, temp.indexOf("÷")-1);
                    Log.i("denna", temp1);
                    String temp2 = temp.substring(temp.indexOf("÷")+2,temp.indexOf("÷")+3);
                    Log.i("denna", temp2);
                    answer = Double.parseDouble(temp1) / Double.parseDouble(temp2);
                }
            }
            showEquation+="= " + answer + "\n";
            //ADD EXTRA STUFF HERE FOR SOLVING
        }
        if(v.getId() == R.id.button20){
            showEquation+="- ";
        }
        if(v.getId() == R.id.button15){
            showEquation+="6 ";
        }
        if(v.getId() == R.id.button12){
            showEquation+="3 ";
        }
        if(v.getId() == R.id.button16){
            showEquation+="7 ";
        }
        if(v.getId() == R.id.button18){
            showEquation+="9 ";
        }
        if(v.getId() == R.id.button14){
            showEquation+="5 ";
        }
        if(v.getId() == R.id.button21){
            showEquation+="x ";
        }
        if(v.getId() == R.id.button19){
            showEquation+="+ ";
        }
        if(v.getId() == R.id.button11){
            showEquation+="2 ";
        }
        if(v.getId() == R.id.button17){
            showEquation+="8 ";
        }
        if(v.getId() == R.id.button22){
            showEquation+="0 ";
        }
        TextView output = findViewById(R.id.output);
        output.setText(showEquation);
    }
}