package com.iris.exceptionHandling;

import java.util.Scanner;

public class Exception1 {
    public static void main(String args[]) {
        try
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter number1: ");
            int num1 = s.nextInt();
            System.out.println("Enter number2: ");
            int num2 = s.nextInt();
            System.out.println(num1 / num2);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("hey");
        System.out.println("hey");
    }}






