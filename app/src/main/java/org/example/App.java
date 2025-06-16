package org.example;
import java.util.Scanner;
public class App {
  public static void main(String[] args) {
    System.out.println("Welcome to the Payroll Program!\n");

    System.out.print("Enter the number of hours you worked: ");
    Scanner scanner = new Scanner(System.in);
    double hours = scanner.nextDouble();

    System.out.print("Enter the number of dependents: ");
    int dependents = scanner.nextInt();

    scanner.close();

    Payroll payroll = new Payroll(hours, dependents);
    payroll.calculate();
  
    Printer printer = new Printer();

    printer.printPayroll(hours, payroll.grossPay, payroll.socSec, payroll.fedTax, payroll.stTax, payroll.union, payroll.ins, payroll.netPay);
}
}