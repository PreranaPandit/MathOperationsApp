package com.example.mathactionsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    //referencing the buttons
    Button btnAreaCircle, btnCheck, btnReverse, btnSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //Binding
        btnAreaCircle = findViewById(R.id.btnAreaCircle);
        btnCheck = findViewById(R.id.btnCheck);
        btnReverse = findViewById(R.id.btnReverse);
        btnSwap = findViewById(R.id.btnSwap);

        btnAreaCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DashboardActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPalindrome = new Intent(DashboardActivity.this, CheckPalindromeActivity.class);
                startActivity(intentPalindrome);
            }
        });

        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReverse = new Intent(DashboardActivity.this, ReverseActivity.class);
                startActivity(intentReverse);
            }
        });

        btnSwap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentSWap = new Intent(DashboardActivity.this, SwapActivity.class);
                startActivity(intentSWap);
            }
        });
    }
}
