package com.example.toasterlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends AppCompatActivity {

    EditText textFirstNo, textsecondNo;
    Button sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        getSupportActionBar().hide();
        bindView();

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (textFirstNo.getText().toString().isEmpty()) {
                    textFirstNo.setError("Enter First Number");
                }
                if (textsecondNo.getText().toString().isEmpty()) {
                    textsecondNo.setError("Enter Second Number");
                }

                double a = Double.parseDouble(textFirstNo.getText().toString());
                double b = Double.parseDouble(textsecondNo.getText().toString());
                double c = a + b;
                int result = (int) Math.round(c);
                ToasterMessage.display(Calculator.this, result);
                finish();
            }
        });

    }

    private void bindView() {
        textFirstNo = findViewById(R.id.txtfirst);
        textsecondNo = findViewById(R.id.txtsecond);
        sum = findViewById(R.id.btnsum);

    }

}