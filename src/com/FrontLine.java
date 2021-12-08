package com;

import java.util.Scanner;

public class FrontLine {
    public static void main(String[] args) {
        double changeIntoYears;
        double myInterest = 0;
        double totalCompoundInterest = 0;
        double totalAmount = 0;
        double newAmount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Hello, enter the interest rate: ");
        double rate = sc.nextDouble();
        System.out.println();
        System.out.print("Enter the amount borrowed GHS ");
        double amount = sc.nextDouble();
        System.out.println();
        System.out.print("Enter the number of months required to pay: ");
        int month = sc.nextInt();
        changeIntoYears = month / 12;

        System.out.printf("You borrowed this amount GHS %.2f", amount);
        System.out.println();

        myInterest = interestCalculator(amount, rate, changeIntoYears);
        System.out.printf("First interest on the amount is GHS %.2f ", myInterest);

        System.out.println();

        newAmount = amount + myInterest;
        totalCompoundInterest = compoundInterestCalculator(newAmount, rate, changeIntoYears);
        totalAmount = totalCompoundInterest + myInterest + amount;
        System.out.printf("The second interest is GHS %.2f ", totalCompoundInterest);
        System.out.println();
        System.out.printf("Total amount to be payed is GHS %.2f ", totalAmount);

    }

    public static double interestCalculator(double amount, double rate, double years) {
        double interest = (amount * rate * years) / 100;
        return interest;
    }

    public static double compoundInterestCalculator(double amount, double rate, double years) {
        double newInterest = (amount * rate * years) / 100;
        return  newInterest;
    }
}
