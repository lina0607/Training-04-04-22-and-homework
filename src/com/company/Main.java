package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    //creating an instance of a class gives us access to the methods in that class

    public static void main(String[] args) {
        Main main = new Main();

        //Tasks
        // main.task1();
        // main.task3();
        //main.task4();
        //main.task5();
        //main.task6();
        main.task7();

    }

    //with static methods you don't need to create an instance of it before calling the method
    void task1() {
        System.out.println("task1 and task2");
        System.out.println("please input a number");
        int val = scanner.nextInt();
        //read value from user


        if ((val % 2) == 0) {
            System.out.println(val + "is an even number");
        } else {
            System.out.println(val + "is an odd number");
        }
    }

    void task3() {
        System.out.println("task3");

        System.out.println("please input number:");

        int val = scanner.nextInt();

        if (val > 0) {
            System.out.println(val + "greater then zero");
        } else if (val < 0) {
            System.out.println(val + "less then zero");
        } else {
            System.out.println(val + "equal to zero");
        }
    }

    void task4() {
        //print out welcome message
        System.out.println("welcome to the rollercoaster! Please input your information below to begin");

        //read height and float from user
        System.out.println("input height");
        int height = scanner.nextInt();

        //read weight and float from user
        System.out.println("input weight");
        float weight = scanner.nextFloat();

        if ((height > 150) && (weight < 180)) {
            System.out.println("fasten your seatbelt!");
        } else {
            System.out.println("I am sorry you can-t go");
        }
    }

    void task5() {
        System.out.println("print task5");

        //read temperature from user in celsius
        System.out.println("input temperature in celsius: ");
        float tempInCelsius = scanner.nextFloat();

        float tempInFahrenheit = 1.8f * tempInCelsius + 32.0f;
        System.out.println(tempInCelsius + "is");
    }

    void task6() {
        System.out.println("print task6");

        //The tax is calculated according to the following rules:
        //up to 85,528.00 tax is 18% of the base minus 556.02,
        //from 85,528.00 tax is 14,839.02 + 32% of the surplus over 85,528.00

        System.out.println("input income: ");
        double income = scanner.nextDouble();

        if ((income < 85528) && (income > 85528)) {
            System.out.println("your tax is: " + (income * 0.18 - 556.02));

        } else {
            System.out.println("your tax is: " + (14839.02 + (income - 85528) * 0.32));
        }

    }

    void task7() {
        System.out.println("print task7");

        //The parameters have restrictions:
        //the loan amount must be between 100.00 and 10,000.00,
        //the number of installments must be between 6 and 48.

        System.out.println("input loan amount:");
        double loanAmount = scanner.nextDouble();

        if ((loanAmount >= 100) && (loanAmount <= 10000)) {

        } else {
            System.out.println("your loan amount should be set at:" + 5000);

        }

        System.out.println("input number of installments:");
        int numberOfInstallments = scanner.nextInt();

        if ((numberOfInstallments >= 6) && (numberOfInstallments <= 48)) {

        } else {
            System.out.println("your number of installments should be set to:" + 36);

        }

        //save the result to variable
        String operation = String.valueOf(new Scanner(System.in));

        //calculate the installment amount based on the number of installments.
        if ((numberOfInstallments >= 6) && (numberOfInstallments <= 12)) {
            System.out.println(loanAmount + 0.025);

        } else if ((numberOfInstallments >= 13) && (numberOfInstallments <= 24)) {
            System.out.println(loanAmount + 0.05);

        } else if ((numberOfInstallments >= 6) && (numberOfInstallments <= 12)) {
            System.out.println(loanAmount + 0.1);

        } else {
            System.out.println("exceeds the acceptable number of installments range");

        }
    }
}