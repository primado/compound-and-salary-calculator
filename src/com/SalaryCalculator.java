package com;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        double mySalary;
        double taxRate = 0.5;
        Scanner input = new Scanner(System.in);
        System.out.print("Hello, kindly enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter the number of hours worked: ");
        int hours = input.nextInt();

        mySalary = payRole(10, hours, taxRate);
        System.out.printf("Hello "+name + " after the calculations your salary is GHS%.2f ", mySalary);
    }
    public static double payRole(int hourlyRate ,int hoursWorked, double tax) {
        hourlyRate = 10; // Hourly rate is initialized to 10 cedis
        tax = 0.5;       // tax is initialized to 50 percent
        double salary = 10 * hoursWorked;  // To get salary, hourly rate that is 10 is multiplied by the hours worked
        double taxedSalary = salary * tax;  //To find the taxed on the salary or income tax, salary is multiplied by the tax rate.
        salary = salary - taxedSalary;      // Income tax is subtracted from salary, that gives the new salary for the employee.
        double newSalary = salary * 0.05; // newSalary if the employee does not meet the 170 hours' threshold

        if (hoursWorked < 170) { // if hours worked is less than 170 hours
            salary = salary - newSalary; // new salary is subtracted from the old salary. Note new salary is the
            return salary;               // amount left when the employee does not meet the minimum working hours.
        } else
            return salary;              // The the salary after the computation is returned.
    }
}
