package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,btn_reset;
    private TextView textView2,p1_wins,p2_wins;
    private int temp = 1;
    private int p1Wins = 1;
    private int p2Wins = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView2 =findViewById(R.id.textView2);
        p1_wins =findViewById(R.id.p1_wins);
        p2_wins =findViewById(R.id.p2_wins);


        btn_reset =findViewById(R.id.btn_reset);
        button1 =findViewById(R.id.button1);
        button2 =findViewById(R.id.button2);
        button3 =findViewById(R.id.button3);
        button4 =findViewById(R.id.button4);
        button5 =findViewById(R.id.button5);
        button6 =findViewById(R.id.button6);
        button7 =findViewById(R.id.button7);
        button8 =findViewById(R.id.button8);
        button9 =findViewById(R.id.button9);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchingXO(button1);
                winCheck(p1_wins,p2_wins,textView2,button1,button2,button3,button4,button5,button6,button7,button8,button9);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchingXO(button2);
                winCheck(p1_wins,p2_wins,textView2,button1,button2,button3,button4,button5,button6,button7,button8,button9);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchingXO(button3);
                winCheck(p1_wins,p2_wins,textView2,button1,button2,button3,button4,button5,button6,button7,button8,button9);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchingXO(button4);
                winCheck(p1_wins,p2_wins,textView2,button1,button2,button3,button4,button5,button6,button7,button8,button9);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchingXO(button5);
                winCheck(p1_wins,p2_wins,textView2,button1,button2,button3,button4,button5,button6,button7,button8,button9);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchingXO(button6);
                winCheck(p1_wins,p2_wins,textView2,button1,button2,button3,button4,button5,button6,button7,button8,button9);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchingXO(button7);
                winCheck(p1_wins,p2_wins,textView2,button1,button2,button3,button4,button5,button6,button7,button8,button9);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchingXO(button8);
                winCheck(p1_wins,p2_wins,textView2,button1,button2,button3,button4,button5,button6,button7,button8,button9);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switchingXO(button9);
                winCheck(p1_wins,p2_wins,textView2,button1,button2,button3,button4,button5,button6,button7,button8,button9);
            }
        });
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset(textView2,button1,button2,button3,button4,button5,button6,button7,button8,button9);
            }
        });

    }
    void switchingXO(Button btn){
        if(temp % 2 !=0){
            btn.setText("X");
        }
        else{
            btn.setText("O");
        }
        temp++;
        btn.setClickable(false);
    }
    void disableButton(Button btn1,Button btn2,Button btn3,Button btn4,Button btn5,Button btn6,Button btn7,Button btn8,Button btn9){
        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
        btn4.setClickable(false);
        btn5.setClickable(false);
        btn6.setClickable(false);
        btn7.setClickable(false);
        btn8.setClickable(false);
        btn9.setClickable(false);

    }
    void winCheck(TextView p1,TextView p2,TextView result, Button btn1,Button btn2,Button btn3,Button btn4,Button btn5,Button btn6,Button btn7,Button btn8,Button btn9){

        if(btn1.getText().equals(btn2.getText())
                && btn2.getText().equals(btn3.getText())
                && (btn1.getText().equals("X") || btn1.getText().equals("O"))
        ){
            if(btn1.getText()== "X"){
                result.setText("Player 1 Wins");
                p1.setText("Player 1 Total Wins :" + p1Wins++);
            }
            if (btn1.getText()=="O"){
                result.setText("player 2 Wins");
                p2.setText("Player 2 Total Wins :" + p2Wins++);
            }
            disableButton(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
        }
        else if(btn4.getText().equals(btn5.getText())
                && btn5.getText().equals(btn6.getText())
                && (btn4.getText().equals("X") || btn4.getText().equals("O"))
        ){
            if(btn4.getText()== "X"){
                result.setText("Player 1 Wins");
                p1.setText("Player 1 Total Wins :" + p1Wins++);
            }
            if (btn4.getText()=="O"){
                result.setText("player 2 Wins");
                p2.setText("Player 2 Total Wins :" + p2Wins++);
            }
            disableButton(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
        }
        else if(btn7.getText().equals(btn8.getText())
                && btn8.getText().equals(btn9.getText())
                && (btn7.getText().equals("X") || btn7.getText().equals("O"))
        ){
            if(btn7.getText()== "X"){
                result.setText("Player 1 Wins");
                p1.setText("Player 1 Total Wins :" + p1Wins++);
            }
            if (btn7.getText()=="O"){
                result.setText("player 2 Wins");
                p2.setText("Player 2 Total Wins :" + p2Wins++);
            }
            disableButton(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
        }
        else if(btn1.getText().equals(btn4.getText())
                && btn4.getText().equals(btn7.getText())
                && (btn1.getText().equals("X") || btn1.getText().equals("O"))
        ){
            if(btn1.getText()== "X"){
                result.setText("Player 1 Wins");
                p1.setText("Player 1 Total Wins :" + p1Wins++);
            }
            if (btn1.getText()=="O"){
                result.setText("player 2 Wins");
                p2.setText("Player 2 Total Wins :" + p2Wins++);
            }
            disableButton(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
        }
        else if(btn2.getText().equals(btn5.getText())
                && btn5.getText().equals(btn8.getText())
                && (btn2.getText().equals("X") || btn2.getText().equals("O"))
        ){
            if(btn2.getText()== "X"){
                result.setText("Player 1 Wins");
                p1.setText("Player 1 Total Wins :" + p1Wins++);
            }
            if (btn2.getText()=="O"){
                result.setText("player 2 Wins");
                p2.setText("Player 2 Total Wins :" + p2Wins++);
            }
            disableButton(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
        }
        else if(btn3.getText().equals(btn6.getText())
                && btn6.getText().equals(btn9.getText())
                && (btn3.getText().equals("X") || btn3.getText().equals("O"))
        ){
            if(btn3.getText()== "X"){
                result.setText("Player 1 Wins");
                p1.setText("Player 1 Total Wins :" + p1Wins++);
            }
            if (btn3.getText()=="O"){
                result.setText("player 2 Wins");
                p2.setText("Player 2 Total Wins :" + p2Wins++);
            }
            disableButton(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
        }
        else if(btn1.getText().equals(btn5.getText())
                && btn5.getText().equals(btn9.getText())
                && (btn1.getText().equals("X") || btn1.getText().equals("O"))
        ){
            if(btn1.getText()== "X"){
                result.setText("Player 1 Wins");
                p1.setText("Player 1 Total Wins :" + p1Wins++);
            }
            if (btn1.getText()=="O"){
                result.setText("player 2 Wins");
                p2.setText("Player 2 Total Wins :" + p2Wins++);
            }
            disableButton(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
        }
        else if(btn3.getText().equals(btn5.getText())
                && btn5.getText().equals(btn7.getText())
                && (btn3.getText().equals("X") || btn3.getText().equals("O"))
        ){
            if(btn3.getText()== "X"){
                result.setText("Player 1 Wins");
                p1.setText("Player 1 Total Wins :" + p1Wins++);
            }
            if (btn3.getText()=="O"){
                result.setText("player 2 Wins");
                p2.setText("Player 2 Total Wins :" + p2Wins++);
            }
            disableButton(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);
        }

    }
    void reset(TextView tv,Button btn1,Button btn2,Button btn3,Button btn4,Button btn5,Button btn6,Button btn7,Button btn8,Button btn9){
        temp = 1;

        tv.setText("");

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        btn1.setClickable(true);
        btn2.setClickable(true);
        btn3.setClickable(true);
        btn4.setClickable(true);
        btn5.setClickable(true);
        btn6.setClickable(true);
        btn7.setClickable(true);
        btn8.setClickable(true);
        btn9.setClickable(true);
    }
}
