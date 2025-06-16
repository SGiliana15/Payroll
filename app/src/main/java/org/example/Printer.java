package org.example;

public class Printer {
    

    public void printPayroll(double hours, double grossPay, double socSec, double fedTax, double stTax, double union, double ins, double netPay){
        
    System.out.println("\nPayroll Stub:");
    System.out.printf("\n\t  Hours:  %.1f\n", hours);
    System.out.printf("\t   Rate:  16.78 $/hr\n"); 
    System.out.printf("\t  Gross:  $ %.2f\n", grossPay);
    System.out.printf("\n\t SocSec:  $ %.2f\n", socSec);
    System.out.printf("\t FedTax:  $ %.2f\n", fedTax);
    System.out.printf("\t  StTax:  $ %.2f\n", stTax);
    System.out.printf("\t  Union:  $ %.2f\n", union);
    System.out.printf("\t    Ins:  $ %.2f\n", ins);

    System.out.printf("\n\tNet Pay:  $ %.2f\n",netPay);

    System.out.print("\nThank you for using the Payroll Program!");

    }
}
