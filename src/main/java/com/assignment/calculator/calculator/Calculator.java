package com.assignment.calculator.calculator;

import java.util.Scanner;

public class Calculator {
  
  public static int sum(int a, int b) {
    return a + b;
  }
  
  public static int subtract(int a, int b) {
    return a - b;
  }
  
  public static int multiply(int a, int b) {
    return a * b;
  }
  
  public static int divide(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("Cannot divide by zero");
    }
    return a / b;
  }
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    int num1 = scanner.nextInt();
    
    System.out.print("Enter the second number: ");
    int num2 = scanner.nextInt();
    
    scanner.close();
    
    System.out.println("Sum: " + sum(num1, num2));
    System.out.println(" Subtract: " + subtract(num1, num2));
    System.out.println(" Multiply: " + multiply(num1, num2));
    System.out.println("Divide: " + divide(num1, num2));
  }
}