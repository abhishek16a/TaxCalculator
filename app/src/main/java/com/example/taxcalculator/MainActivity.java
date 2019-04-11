package com.example.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.taxcalculator.TaxCalculator_abhishek;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Calculate;
    private TextView Taxamount;
    private EditText Salary ;
    private TaxCalculator_abhishek taxcalculator_sandesh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculate=findViewById(R.id.Calculate);
        Taxamount=findViewById(R.id.TaxAmount);
        Salary=findViewById(R.id.Salary);
        taxcalculator_sandesh=new TaxCalculator_abhishek();
        Calculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(Salary.getText().toString())) {
            Salary.setError("Enter your salary.");
            Salary.requestFocus();
            return;

        }

        Double salary = Double.parseDouble(Salary.getText().toString());

        taxcalculator_sandesh.setSalary(salary);
        Taxamount.setText(Double.toString (taxcalculator_sandesh.calculation()));


    }
}

