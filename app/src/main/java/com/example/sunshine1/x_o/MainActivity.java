package com.example.sunshine1.x_o;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView Cell00;
    TextView Cell01;
    TextView Cell02;
    TextView Cell10;
    TextView Cell11;
    TextView Cell12;
    TextView Cell20;
    TextView Cell21;
    TextView Cell22;
    TextView Score1;
    TextView Score2;
    TextView Result;
    boolean P1=true;
    int k=0;
    int won=0;
    public void checkGame() {
        if((!Cell00.getText().toString().equals("") && Cell00.getText().toString().equals(Cell01.getText().toString()) && Cell00.getText().toString().equals(Cell02.getText().toString())) || (!Cell10.getText().toString().equals("") && Cell10.getText().toString().equals(Cell11.getText().toString()) && Cell10.getText().toString().equals(Cell12.getText().toString())) || (!Cell20.getText().toString().equals("") && Cell20.getText().toString().equals(Cell21.getText().toString()) && Cell20.getText().toString().equals(Cell22.getText().toString())) || (!Cell00.getText().toString().equals("") && Cell00.getText().toString().equals(Cell10.getText().toString()) && Cell00.getText().toString().equals(Cell20.getText().toString())) || (!Cell01.getText().toString().equals("") && Cell01.getText().toString().equals(Cell11.getText().toString()) && Cell01.getText().toString().equals(Cell21.getText().toString())) || (!Cell02.getText().toString().equals("") && Cell02.getText().toString().equals(Cell12.getText().toString()) && Cell02.getText().toString().equals(Cell22.getText().toString())) || (!Cell00.getText().toString().equals("") && Cell00.getText().toString().equals(Cell11.getText().toString()) && Cell00.getText().toString().equals(Cell22.getText().toString())) || (!Cell02.getText().toString().equals("") && Cell02.getText().toString().equals(Cell11.getText().toString()) && Cell02.getText().toString().equals(Cell20.getText().toString()))){
            if(P1){
                Result.setText("Player1 Won");
                int cnt= Integer.parseInt(Score1.getText().toString());
                cnt++;
                Score1.setText(String.valueOf(cnt));
                k=1;
                won=1;
            }
            else {
                Result.setText("Player2 Won");
                int cnt= Integer.parseInt(Score2.getText().toString());
                cnt++;
                Score2.setText(String.valueOf(cnt));
                k=2;
                won=2;
            }
            Cell00.setText("");
            Cell01.setText("");
            Cell02.setText("");
            Cell10.setText("");
            Cell11.setText("");
            Cell12.setText("");
            Cell20.setText("");
            Cell21.setText("");
            Cell22.setText("");
        }
        else if(!Cell00.getText().toString().equals("") && !Cell01.getText().toString().equals("") && !Cell02.getText().toString().equals("") && !Cell10.getText().toString().equals("") && !Cell11.getText().toString().equals("") && !Cell12.getText().toString().equals("") && !Cell20.getText().toString().equals("") && !Cell21.getText().toString().equals("") && !Cell22.getText().toString().equals("")){
            Result.setText("Tie");
            Cell00.setText("");
            Cell01.setText("");
            Cell02.setText("");
            Cell10.setText("");
            Cell11.setText("");
            Cell12.setText("");
            Cell20.setText("");
            Cell21.setText("");
            Cell22.setText("");
            k=won;
        }
        else k=0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cell00=(TextView) findViewById(R.id.cell00);
        Cell01=(TextView) findViewById(R.id.cell01);
        Cell02=(TextView) findViewById(R.id.cell02);
        Cell10=(TextView) findViewById(R.id.cell10);
        Cell11=(TextView) findViewById(R.id.cell11);
        Cell12=(TextView) findViewById(R.id.cell12);
        Cell20=(TextView) findViewById(R.id.cell20);
        Cell21=(TextView) findViewById(R.id.cell21);
        Cell22=(TextView) findViewById(R.id.cell22);
        Score1=(TextView) findViewById(R.id.score1);
        Score2=(TextView) findViewById(R.id.score2);
        Result=(TextView) findViewById(R.id.result);

        Cell00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Cell00.getText().toString().equals("")) {
                    if (P1) Cell00.setText("X");
                    else Cell00.setText("O");
                    P1 = !P1;
                    checkGame();
                }
            }
        });
        Cell01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Cell01.getText().toString().equals("")) {
                    if (P1) Cell01.setText("X");
                    else Cell01.setText("O");
                    checkGame();
                    if(k==1) P1=true;
                    else if(k==2) P1=false;
                    else P1 = !P1;
                }
            }
        });
        Cell02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Cell02.getText().toString().equals("")) {
                    if (P1) Cell02.setText("X");
                    else Cell02.setText("O");
                    checkGame();
                    if(k==1) P1=true;
                    else if(k==2) P1=false;
                    else P1 = !P1;
                }
            }
        });
        Cell10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Cell10.getText().toString().equals("")) {
                    if (P1) Cell10.setText("X");
                    else Cell10.setText("O");
                    checkGame();
                    if(k==1) P1=true;
                    else if(k==2) P1=false;
                    else P1 = !P1;
                }
            }
        });
        Cell11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Cell11.getText().toString().equals("")) {
                    if (P1) Cell11.setText("X");
                    else Cell11.setText("O");
                    checkGame();
                    if(k==1) P1=true;
                    else if(k==2) P1=false;
                    else P1 = !P1;
                }
            }
        });
        Cell12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Cell12.getText().toString().equals("")) {
                    if (P1) Cell12.setText("X");
                    else Cell12.setText("O");
                    checkGame();
                    if(k==1) P1=true;
                    else if(k==2) P1=false;
                    else P1 = !P1;
                }
            }
        });
        Cell20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Cell20.getText().toString().equals("")) {
                    if (P1) Cell20.setText("X");
                    else Cell20.setText("O");
                    checkGame();
                    if(k==1) P1=true;
                    else if(k==2) P1=false;
                    else P1 = !P1;
                }
            }
        });
        Cell21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Cell21.getText().toString().equals("")) {
                    if (P1) Cell21.setText("X");
                    else Cell21.setText("O");
                    checkGame();
                    if(k==1) P1=true;
                    else if(k==2) P1=false;
                    else P1 = !P1;
                }
            }
        });
        Cell22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Cell22.getText().toString().equals("")) {
                    if (P1) Cell22.setText("X");
                    else Cell22.setText("O");
                    checkGame();
                    if(k==1) P1=true;
                    else if(k==2) P1=false;
                    else P1 = !P1;                }
            }
        });
    }

}
