package com.example.android.helper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This method open the new activity with quiz questions.
     * @param view The view.
     */
    public void Start(View view) {
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
    }
}