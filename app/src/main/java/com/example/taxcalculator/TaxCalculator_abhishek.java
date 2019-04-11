package com.example.taxcalculator;

public class TaxCalculator_abhishek {
    double salary;
    double mintax=0.01;
    double midtax= 0.15;
    double maxtax= 0.25;

    public double getAmount() {
        return salary;
    }

    public void setAmount(double salary) {
        this.salary = salary;
    }

    public double taxableAmount(){
        double amount=salary*12;
        double grandPayableTax = 0;
        if(amount<=200000){
            double taxamount=amount*mintax;
            return grandPayableTax=taxamount;
        }
        else if (amount>200000 && amount<=350000){
            double midAmount=200000;
            double newamount=amount-midAmount;
            double taxableamount=newamount*midtax;
            double newamount2=amount-newamount;
            double midTax=newamount2*mintax;
            double totaltaxamount=taxableamount+midTax;
            return grandPayableTax=totaltaxamount;
        }
        else if(amount>350000) {
            double minAmount = 200000;
            double mustPayTax=minAmount*mintax;
            double midAmount=150000;
            double midPayTax=midAmount*0.015;
            double maxPayamount=amount-350000;
            double maxPayTax=maxPayamount*maxtax;

            double totaltaxamount = mustPayTax + midPayTax +maxPayTax;
            return grandPayableTax = totaltaxamount;

        }
        return grandPayableTax;
    }
}

