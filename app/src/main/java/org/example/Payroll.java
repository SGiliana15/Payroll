package org.example;

public class Payroll {
    private double hours;
    private int dependents;

    public double grossPay;
    public double netPay;
    public double socSec;
    public double fedTax;
    public double stTax;
    public double union;
    public double ins;
    
    public Payroll(double hours, int dependents){
        this.hours = hours;
        this.dependents = dependents;
    }
     public void calculate(){
        if (hours <= 40){
            grossPay = hours * 16.78;
        }  
        else {
            grossPay = (40.0 * 16.78) + ((hours - 40.0) * (16.78 * 1.5));
        }

     if (dependents >= 3){
            ins = 35;
        }
        else {
            ins = 15;
        }

        socSec = grossPay * 0.06;
        fedTax = grossPay * 0.14;
        stTax = grossPay * 0.05;
        union = 10;
        double totalDed = socSec + fedTax + stTax + union + ins;
        netPay = grossPay - totalDed;

    }
}