package com.example.mathactionsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ReverseActivity extends AppCompatActivity {

    EditText etReverseNum;
    Button btnReverse;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reverse);

        etReverseNum = (EditText) findViewById(R.id.etReverseNum);
        btnReverse = (Button) findViewById(R.id.btnReverse);
        tvOutput = (TextView) findViewById(R.id.tvOutput);

        btnReverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int reverseNumber;

                reverseNumber = Integer.parseInt(etReverseNum.getText().toString());

                ReverseClass reverseC = new ReverseClass(reverseNumber);
                int reverse = reverseC.getReverseNum();

               // tvOutput.setText(reverseC+"");
                tvOutput.setText(reverse +" is a reverse number");
            }
        });
    }
}
