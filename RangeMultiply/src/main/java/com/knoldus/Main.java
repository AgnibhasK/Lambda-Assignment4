package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RangeMultiply instance = new RangeMultiply();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
         int FirstRange = (int) scanner.nextLong();
        System.out.println("Enter Second Number : ");
         int secondNumber = (int) scanner.nextLong();

       System.out.println(instance.calculate(FirstRange,  secondNumber));
    }
}





