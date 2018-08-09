package com.example.javalayout;

import android.content.DialogInterface;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout framelayout=new FrameLayout(this);
        framelayout.setBackground(R.mipmap.bg);
        setContentView(frameLayout);
        TextView Text1 = new TextView(this);
        text1.setText("Start");
        text1.setTextSize(TypedValue.COMPLEX_UNIT_SP,36);
        text1.setTextColor(Color.rgb(20,185,165));
        FrameLayout.LayoutParams params=new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity= Gravity.CENTER;
        text1.setLayoutParams(params);
        text1.setOnClickListener(new View.OnCreateContextMenuListener()){
            public void onClick(View v){
                new AlertDialog.Builder(MainActivity.this).setTitle("Reminder")
                        .setMessage("It is dangerous to enter the game")
                        .setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        Log.i("TableBall","Enter game");
                                    }
                                }).setNegativeButton("Exit", new dialog)


                        )
            }
        }


    }
}
