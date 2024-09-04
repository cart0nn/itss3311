package SalaryCalculator;

// Project 1 - Salary Calculator - Carson Smith.

import java.util.Scanner;

public class SalaryCalculator {

    // instance variables
    private double startingSalary;
    private double annualIncreaseRate;

    // constructor
    public SalaryCalculator(double startingSalary, double annualIncreaseRate) {
        this.startingSalary = startingSalary;
        this.annualIncreaseRate = annualIncreaseRate;
    }
    // calculate yearly salaries for int years according to P * (1 + r)^t formula for compound interest
    public double raiseCalc(int years) {
        return startingSalary * Math.pow(1 + annualIncreaseRate, years);
    }
    // handling scanner
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object creation

        System.out.println("Enter your starting salary: ");
        double startingSalary = sc.nextDouble(); // takes input as salary. accepts commas and decimal points in number
        System.out.println("Enter annual increase rate: ");
        double annualIncreaseRate = sc.nextDouble(); // takes next input as increase rate, in decimal format

        SalaryCalculator calculator = new SalaryCalculator(startingSalary, annualIncreaseRate); // create SalaryCalculator object and pass user input into it

        // calculate raises
        double yearOneSalary = calculator.raiseCalc(1);
        double yearTwoSalary = calculator.raiseCalc(2);

        // output formatted to round numbers to second decimal place
        System.out.printf("After the first year your salary will be $%.2f\n", yearOneSalary);
        System.out.printf("After the second year your salary will be $%.2f", yearTwoSalary);

        // close scanner
        sc.close();
    }
}
