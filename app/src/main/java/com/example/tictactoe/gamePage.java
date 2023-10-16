package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class gamePage extends AppCompatActivity {
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
TextView txt;
ImageView imgO,imgX,player1win,player2win;
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
Animation player1wins;
int flag =0;
int count=0;
int disable=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_page);
      btn1 =  findViewById(R.id.button1);
        btn2 =  findViewById(R.id.button2);
        btn3 =  findViewById(R.id.button3);
        btn4 =  findViewById(R.id.button4);
        btn5 =  findViewById(R.id.button5);
        btn6 =  findViewById(R.id.button6);
        btn7 =  findViewById(R.id.button7);
        btn8 =  findViewById(R.id.button8);
        btn9 =  findViewById(R.id.button9);
        txt =findViewById(R.id.textView);
        imgO = findViewById(R.id.btn1O);
        imgX = findViewById(R.id.btn1X);
        player1win=findViewById(R.id.player1win);
        player2win=findViewById(R.id.player2win);
        player1win.setZ(6);
        player2win.setZ(6);

    }
    public void check(View view) {
        Button btnCurrent = (Button) view;
        if (disable == 0) {
            if (btnCurrent.getText().toString().equals("")) {
                count++;
                if (flag == 0) { btnCurrent.setTextSize(50);
                    btnCurrent.setText("X");
                    if(btnCurrent==btn1)
                        imgX.setVisibility(View.INVISIBLE);
                   //  btnCurrent.setBackgroundColor(Color.parseColor("#000000"));

                     btnCurrent.setTextColor(Color.parseColor("#00E5FF"));
                    txt.setText("player 2 turn");
                    txt.setTextColor(Color.parseColor("#8E24AA"));
                    flag = 1;
                } else { btnCurrent.setTextSize(50);
                    btnCurrent.setText("O");
                    if(btnCurrent==btn1)
                        imgO.setVisibility(View.INVISIBLE);
                 //   btnCurrent.setBackgroundColor(Color.parseColor("#000000"));
                    btnCurrent.setTextColor(Color.parseColor("#8E24AA"));
                    txt.setText("player 1 turn");
                    txt.setTextColor(Color.parseColor("#00E5FF"));
                    flag = 0;
                }
                if (count > 4) {
                    b1 = btn1.getText().toString();
                    b2 = btn2.getText().toString();
                    b3 = btn3.getText().toString();
                    b4 = btn4.getText().toString();
                    b5 = btn5.getText().toString();
                    b6 = btn6.getText().toString();
                    b7 = btn7.getText().toString();
                    b8 = btn8.getText().toString();
                    b9 = btn9.getText().toString();
                    player1wins = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.player1wins);
                    Intent intent = new Intent(this,winnerScreen.class);
                    Intent intent2 = new Intent(this,winnerscreen2.class);
                    if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                        //1
                        disable =1;
                        if (b1.equals("X") ){
                            txt.setText("player 1 won ");
                         //   startActivity(intent);
                     //      player1win.setVisibility(View.VISIBLE);
                            player1win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#00E5FF"));
                        } else {
                            txt.setText("player 2 won ");
                           // startActivity(intent2);
                            player2win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#8E24AA"));
                        }
                    } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                        //2
                        disable =1;
                        if (b4.equals("X")) {
                            txt.setText("player 1 won ");
                           // startActivity(intent);
                            player1win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#00E5FF"));
                        } else {
                            txt.setText("player 2 won ");
                           // startActivity(intent2);
                            player2win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#8E24AA"));
                        }
                    } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                        //3
                        disable =1;
                        if (b7.equals("X")) {
                            txt.setText("player 1 won ");
                          //  startActivity(intent);
                            player1win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#00E5FF"));
                        } else {
                            txt.setText("player 2 won ");
                         //   startActivity(intent2);
                            player2win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#8E24AA"));
                        }
                    } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                        //4
                        disable =1;
                        if (b1.equals("X")) {
                            txt.setText("player 1 won ");
                           // startActivity(intent);
                            player1win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#00E5FF"));
                        } else {
                            txt.setText("player 2 won ");
                          //  startActivity(intent2);
                            player2win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#8E24AA"));
                        }
                    } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                        //5
                        disable =1;
                        if (b2.equals("X")) {
                            txt.setText("player 1 won ");
                           // startActivity(intent);
                            player1win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#00E5FF"));
                        } else {
                            txt.setText("player 2 won ");
                          //  startActivity(intent2);
                            player2win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#8E24AA"));
                        }
                    } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                        //6
                        disable =1;
                        if (b3.equals("X")) {
                            txt.setText("player 1 won ");
                          //  startActivity(intent);
                            player1win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#00E5FF"));
                        } else {
                            txt.setText("player 2 won ");
                         //   startActivity(intent2);
                            player2win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#8E24AA"));
                        }
                    } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                        //7
                        disable =1;
                        if (b1.equals("X")) {
                            txt.setText("player 1 won ");
                           // startActivity(intent);
                            player1win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#00E5FF"));
                        } else {
                            txt.setText("player 2 won ");
                           // startActivity(intent2);
                            player2win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#8E24AA"));
                        }
                    } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                        //8
                        disable =1;
                        if (b3.equals("X")) {
                            txt.setText("player 1 won ");
                          //  startActivity(intent);
                            player1win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#00E5FF"));
                        } else {
                            txt.setText("player 2 won ");
                          //  startActivity(intent2);
                            player2win.startAnimation(player1wins);
                            txt.setTextColor(Color.parseColor("#8E24AA"));
                        }
                    }else if(count==9){txt.setText("Match Draw ");
                        txt.setTextColor(Color.parseColor("#000000"));}

                }
            }
        }
    }



    public void restart( View v)
         {   btn1.setText("");
             btn2.setText("");
             btn3.setText("");
             btn4.setText("");
             btn5.setText("");
             btn6.setText("");
             btn7.setText("");
             btn8.setText("");
             btn9.setText("");
             disable =0;
             count=0;

             if(flag==0){
                 txt.setText("player 1 turn");
                 txt.setTextColor(Color.parseColor("#00E5FF"));
             } else{
                 txt.setText("player 2 turn");
                 txt.setTextColor(Color.parseColor("#8E24AA"));
             }
             imgX.setVisibility(View.INVISIBLE);
             imgO.setVisibility(View.INVISIBLE);
             player1win.clearAnimation();
             player2win.clearAnimation();
             btn1.setBackgroundColor(Color.parseColor("#00FFFFFF"));
             btn2.setBackgroundColor(Color.parseColor("#00FFFFFF"));
             btn3.setBackgroundColor(Color.parseColor("#00FFFFFF"));
             btn4.setBackgroundColor(Color.parseColor("#00FFFFFF"));
             btn5.setBackgroundColor(Color.parseColor("#00FFFFFF"));
             btn6.setBackgroundColor(Color.parseColor("#00FFFFFF"));
             btn7.setBackgroundColor(Color.parseColor("#00FFFFFF"));
             btn8.setBackgroundColor(Color.parseColor("#00FFFFFF"));
             btn9.setBackgroundColor(Color.parseColor("#00FFFFFF"));
         }

}