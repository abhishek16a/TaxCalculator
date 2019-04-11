package com.example.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnCalculate;
    private TextView tvOut,tvTaxableAmount;
    private EditText etAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculate=findViewById(R.id.btnCalculate);
        tvTaxableAmount=findViewById(R.id.tvTaxAmount);
        etAmount=findViewById(R.id.etSalary);
        tvOut=findViewById(R.id.tvTotal);

        btnCalculate.setOnClickListener(this);
    }
    public void onClick(View v){
        int id = v.getId();
        if(id == R.id.btnCalculate)
        {
            if(!validate()){
                return;
            }
            double salary=Double.parseDouble(etAmount.getText().toString());

            TaxCalculator_abhishek taxCalculator_abhishek=new TaxCalculator_abhishek();
            taxCalculator_abhishek.setAmount(salary);
            Double tax=taxCalculator_abhishek.taxableAmount();
            tvTaxableAmount.setText(Double.toString(tax));
            double annualsalary=salary*12;
            double totalsalary=annualsalary-tax;
            tvOut.setText(Double.toString(totalsalary));
        }
    }
    public boolean validate(){
        boolean isValid=true;
        if(TextUtils.isEmpty(etAmount.getText().toString())){
            etAmount.setError("Please Enter Your Salary");
            etAmount.requestFocus();
            isValid=false;
        }return isValid;
    }
}




