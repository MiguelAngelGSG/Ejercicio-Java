package com.ejercicio;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try ( 
            Scanner scanner = new Scanner(System.in)) {
            System.out.print("Please, insert your weight in Kilograms: ");
            double weight = scanner.nextDouble();
            System.out.print("Please, insert your height in meters: ");
            double height = scanner.nextDouble();


        double bmiCalculo = weight/Math.pow(height, 2);
                
        double bmi = Math.round(bmiCalculo * 10d) / 10d;


        if(bmi < 16.0) {
            System.out.println("Your BMI is: " + bmi + ". You are severely underweight.");
        } else if(bmi >= 16.0 && bmi < 17.0) {
            System.out.println("Your BMI is: " + bmi + ". You are moderately underweight.");
        } else if(bmi >= 17.0 && bmi < 18.5) {
            System.out.println("Your BMI is: " + bmi + ". You are lightly underweight.");
        } else if(bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Your BMI is: " + bmi + ". Your weight is normal.");
        } else if(bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Your BMI is: " + bmi + ". You are overweight.");
        } else if(bmi >= 30.0 && bmi < 35.0) {
            System.out.println("Your BMI is: " + bmi + ". You are lightly obese.");
        } else if(bmi >= 35.0 && bmi < 40.0) {
            System.out.println("Your BMI is: " + bmi + ". You are moderately obese.");
        }if(bmi >= 40.0) {
            System.out.println("Your BMI is: " + bmi + ". You are morbidly obese.");
        }
        }
    }
}