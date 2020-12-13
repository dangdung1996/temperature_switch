package com.codegym;

import java.util.Scanner;

public class Main {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9)*(fahrenheit-32);
        return celsius;
    }
    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. C sang F");
            System.out.println("2. F sang C");
            System.out.println("0. Exit");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice == 0);
        System.out.println("Nhập độ C");
        fahrenheit = sc.nextDouble();
        System.out.println("Độ F là : "+ celsiusToFahrenheit(fahrenheit));

        System.out.println("Nhập độ F");
        celsius = sc.nextDouble();
        System.out.println("Độ C là : "+ fahrenheitToCelsius(celsius));
    }

}
