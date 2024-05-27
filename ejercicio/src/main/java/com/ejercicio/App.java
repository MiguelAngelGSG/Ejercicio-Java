package com.ejercicio;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduzca su peso en kilogramos: ");
            double weight = scanner.nextDouble();
            System.out.print("Introduzca su altura en metros: ");
            double height = scanner.nextDouble();


        double bmiCalculo = weight/Math.pow(height, 2);
                
        double bmi = Math.round(bmiCalculo * 10d) / 10d;


        if(bmi < 16.0) {
            System.out.println("Tu índice de masa corporal es: " + bmi + ". Tienes delgadez severa.");
        } else if(bmi >= 16.0 && bmi < 17.0) {
            System.out.println("Tu índice de masa corporal es: " + bmi + ". Tienes delgadez moderada.");
        } else if(bmi >= 17.0 && bmi < 18.5) {
            System.out.println("Tu índice de masa corporal es: " + bmi + ". Tienes delgadez leve.");
        } else if(bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Tu índice de masa corporal es: " + bmi + ". Tienes peso normal.");
        } else if(bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Tu índice de masa corporal es: " + bmi + ". Tienes sobrepeso.");
        } else if(bmi >= 30.0 && bmi < 35.0) {
            System.out.println("Tu índice de masa corporal es: " + bmi + ". Tienes obesidad leve.");
        } else if(bmi >= 35.0 && bmi < 40.0) {
            System.out.println("Tu índice de masa corporal es: " + bmi + ". Tienes obesidad moderada.");
        }if(bmi >= 40.0) {
            System.out.println("Tu índice de masa corporal es: " + bmi + ". Tienes obesidad mórbida.");
        }
        }
    }
}