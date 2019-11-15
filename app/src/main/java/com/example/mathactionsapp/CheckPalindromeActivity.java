package com.example.mathactionsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CheckPalindromeActivity extends AppCompatActivity {

    EditText txtPalindrome;
    Button btnCheck;
    TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_palindrome);

             //data binding
       // txtPalindrome.findViewById(R.id.etPalindromeNum);
      //  btnCheck.findViewById(R.id.btnCheckPalindrome);
       // tvResult.findViewById(R.id.tvResult);

        txtPalindrome = (EditText) findViewById(R.id.etPalindromeNum);
       btnCheck = (Button) findViewById(R.id.btnCheckPalindrome);
       tvResult = (TextView) findViewById(R.id.tvResult);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int palindromeNUm;

                palindromeNUm = Integer.parseInt(txtPalindrome.getText().toString());

                boolean isPalindrome;

                PalindromeClass pClass = new PalindromeClass(palindromeNUm);
                isPalindrome = pClass.checkPalin();

                if(isPalindrome)
                {
                    tvResult.setText(tvResult.getText()+" It is a palindrome number");
                }
                else{
                    tvResult.setText(tvResult.getText()+" It is not a palindrome number");
                }
            }
        });


    }
}
