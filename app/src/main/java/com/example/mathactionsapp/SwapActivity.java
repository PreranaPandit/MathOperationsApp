package com.example.mathactionsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class SwapActivity extends AppCompatActivity {

    EditText etFirst, etSecond;
    Button btnSWap;
    TextView tvSwappedNumbers, tvUnSwappedNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swap);

        //Binding

        etFirst = (EditText) findViewById(R.id.etFirst);
        etSecond = (EditText) findViewById(R.id.etSecond);
        btnSWap = (Button) findViewById(R.id.btnSwap);
        tvSwappedNumbers = (TextView) findViewById(R.id.tvSwappedNumbers);
        tvUnSwappedNumbers = (TextView) findViewById(R.id.tvUnSwappedNumbers);

        btnSWap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(etFirst.getText())) {
                    etFirst.setError("Enter First Number");
                } else if (TextUtils.isEmpty(etSecond.getText())) {
                    etSecond.setError("Enter Second Number");
                } else {
                    int num1 = Integer.parseInt(String.valueOf(etFirst.getText()));
                    int num2 = Integer.parseInt(String.valueOf(etSecond.getText()));

                    SWapClass Swap = new SWapClass(num1, num2);

                    int[] swap = Swap.swapNUmbers();

                    tvSwappedNumbers.setText("Before Swap : [" + num1 + " ," + num2 + "]");
                    tvUnSwappedNumbers.setText("After Swap : " + Arrays.toString(swap));


                }
            }
        });
    }
}


