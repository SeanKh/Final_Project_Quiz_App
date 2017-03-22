package com.example.android.helper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* requestWindowFeature(Window.FEATURE_NO_TITLE);*/
        setContentView(R.layout.activity_menu);

        Button but1=(Button)findViewById(R.id.quiz);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(MenuActivity.this, QuizActivity.class);
                startActivity(int1);
            }
        });

        Button but2=(Button)findViewById(R.id.random_button);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2=new Intent(MenuActivity.this, RandomChoice.class);
                startActivity(int2);
            }
        });

        Button but3=(Button)findViewById(R.id.addFood);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3=new Intent(MenuActivity.this, AddFood.class);
                startActivity(int3);
            }
        });
    }
}
