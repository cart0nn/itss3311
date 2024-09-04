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

    public double raiseCalc(int years) {
        return startingSalary * Math.pow(1 + annualIncreaseRate, years);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your starting salary: ");
        double startingSalary = sc.nextDouble();
        System.out.println("Enter annual increase rate: ");
        double annualIncreaseRate = sc.nextDouble();

        SalaryCalculator calculator = new SalaryCalculator(startingSalary, annualIncreaseRate);

        double yearOneSalary = calculator.raiseCalc(1);
        double yearTwoSalary = calculator.raiseCalc(2);

        System.out.printf("After the first year your salary will be $%.2f\n", yearOneSalary);
        System.out.printf("After the second year your salary will be $%.2f", yearTwoSalary);

        sc.close();
    }
}
