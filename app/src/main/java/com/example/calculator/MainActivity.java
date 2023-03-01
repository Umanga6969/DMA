package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText costofServiceText;
    private Button calButton;
    private RadioGroup radioGroup;
    private Switch roundupSwitch;
    private TextView tipAmountText;
    private double tipAmount;
    private double tipPercent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        costofServiceText = findViewById(R.id.costofServiceText);
        calButton = findViewById(R.id.calButton);
        roundupSwitch = findViewById(R.id.roundupSwitch);
        tipAmountText = findViewById(R.id.tipAmountText);


        calButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}