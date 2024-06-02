package com.example;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight in kilograms (Use , for decimals): ");
        float weight = scanner.nextFloat();

        System.out.println("Enter your height in meters (Use , for decimals): ");
        float height = scanner.nextFloat();

        float imc = (float) (weight / Math.pow(height, 2));

        String roundedBMI = String.format("%.2f", imc);
        System.out.println("Your Body Mass Index is: " + roundedBMI);

        if (imc < 16.0) {
            System.out.println("You are Severely Underweight.");
        } else if (imc >= 16.0 && imc < 17.0) {
            System.out.println("You are Moderately Underweight.");
        } else if (imc >= 17.0 && imc < 18.5) {
            System.out.println("You are Underweight.");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("You are Normal.");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("You are Overweight.");
        } else if (imc >= 30.0 && imc < 35.0) {
            System.out.println("You are Moderately Obese");
        } else if (imc >= 35.0 && imc < 40.0) {
            System.out.println("You are Severely Obese");
        } else if (imc >= 40) {
            System.out.println("You are Morbidly Obese");
        }

        scanner.close();

    }
}