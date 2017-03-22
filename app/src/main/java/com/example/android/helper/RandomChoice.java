package com.example.android.helper;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class RandomChoice extends AppCompatActivity {

    private String[] myString;
    private static final Random rgenerator = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_choice);

        Resources res = getResources();

        myString = res.getStringArray(R.array.myArray);

        String q = myString[rgenerator.nextInt(myString.length)];

        TextView tv = (TextView) findViewById(R.id.choice);
        tv.setText(q);

        Button backbutton=(Button)findViewById(R.id.back);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1=new Intent(RandomChoice.this, MenuActivity.class);
                startActivity(int1);
            }
        });
    }
}
