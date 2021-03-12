package com.knoldus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
         String FirstRange = scanner.nextLine();
        System.out.println("Enter Second Number : ");
         String secondNumber = scanner.nextLine();

       System.out.println(RangeMultiply.calculate(FirstRange,  secondNumber));
    }
}





