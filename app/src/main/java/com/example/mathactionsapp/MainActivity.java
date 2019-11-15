package com.example.mathactionsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etRadius;
    Button btnCalculate;
    TextView tvArea;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etRadius = findViewById(R.id.etRadius);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvArea = findViewById(R.id.tvArea);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(etRadius.getText()))
                {
                   etRadius.setError("Please enter the radius of the circle!!");
                   //return;
                }
                else{
                    float rRadius;
                    float cArea;

                    rRadius = Float.parseFloat(etRadius.getText().toString());

                    Mathematics math = new Mathematics(rRadius);

                    cArea = math.area();

                    tvArea.setText(Float.toString(cArea));

                }




            }
        });





    }
}
