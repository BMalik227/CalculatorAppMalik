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

    String showEquation = "";
    String textOutput = "";

    String addNum;

    public int search(String str){
        String search ="";
        //Create a method here to find the next symbol in an equation
        while(search != ""){

        }
    }
    public void buttonClicked(View v){
        if(v.getId() == R.id.button3){
            showEquation+="1";
            textOutput+="1";
        }
        if(v.getId() == R.id.buttonDivide){
            showEquation+=" ÷ ";
            textOutput+=" ÷ ";
        }
        if(v.getId() == R.id.button13){
            showEquation+="4";
            textOutput+="4";
        }
        if(v.getId() == R.id.button24){
            double answer = 0;
            showEquation += " = ";
            String temp = showEquation;
            Log.i("denna", temp);
            if(temp.indexOf("÷") >= 0){
                if (temp.indexOf("÷") >= 2){
                    String temp1 = temp.substring(0, temp.indexOf("÷")-1);
                    Log.i("denna", temp1);
                    String temp2 = temp.substring(temp.indexOf("÷")+2,temp.indexOf("=")-1);
                    Log.i("denna", temp2);
                    answer = Double.parseDouble(temp1) / Double.parseDouble(temp2);
                }
            }
            else if(temp.indexOf("x") >= 0){
                if (temp.indexOf("x") >= 2){
                    String temp1 = temp.substring(0, temp.indexOf("x")-1);
                    Log.i("denna", temp1);
                    String temp2 = temp.substring(temp.indexOf("x")+2,temp.indexOf("=")-1);
                    Log.i("denna", temp2);
                    answer = Double.parseDouble(temp1) * Double.parseDouble(temp2);
                }
            }
            else if(temp.indexOf("+") >= 0){
                if (temp.indexOf("+") >= 2){
                    String temp1 = temp.substring(0, temp.indexOf("+")-1);
                    Log.i("denna", temp1);
                    String temp2 = temp.substring(temp.indexOf("+")+2,temp.indexOf("=")-1);
                    Log.i("denna", temp2);
                    answer = Double.parseDouble(temp1) + Double.parseDouble(temp2);
                }
            }
            else if(temp.indexOf("-") >= 0){
                if (temp.indexOf("-") >= 2){
                    String temp1 = temp.substring(0, temp.indexOf("-")-1);
                    Log.i("denna", temp1);
                    String temp2 = temp.substring(temp.indexOf("-")+2,temp.indexOf("=")-1);
                    Log.i("denna", temp2);
                    answer = Double.parseDouble(temp1) - Double.parseDouble(temp2);
                }
            }
            Log.i("denna", answer+"");
            textOutput += " = " + answer + "\n";
            showEquation = "";
            //ADD EXTRA STUFF HERE FOR SOLVING
        }
        if(v.getId() == R.id.button20){
            showEquation+=" - ";
            textOutput+=" - ";


        }
        if(v.getId() == R.id.button15){
            showEquation+="6";
            textOutput+="6";
        }
        if(v.getId() == R.id.button12){
            showEquation+="3";
            textOutput+="3";
        }
        if(v.getId() == R.id.button16){
            showEquation+="7";
            textOutput+="7";
        }
        if(v.getId() == R.id.button18){
            showEquation+="9";
            textOutput+="9";
        }
        if(v.getId() == R.id.button14){
            showEquation+="5";
            textOutput+="5";
        }
        if(v.getId() == R.id.button21){
            showEquation+=" x ";
            textOutput+=" x ";
        }
        if(v.getId() == R.id.button19){
            showEquation+=" + ";
            textOutput+=" + ";
        }
        if(v.getId() == R.id.button11){
            showEquation+="2";
            textOutput+="2";
        }
        if(v.getId() == R.id.button17){
            showEquation+="8";
            textOutput+="8";
        }
        if(v.getId() == R.id.button22){
            showEquation+="0";
            textOutput+= "0";
        }
        TextView output = findViewById(R.id.output);
        output.setText(textOutput);
    }
}