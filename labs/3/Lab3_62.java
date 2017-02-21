/**
   * file: Lab3_62.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 3 
   * due date: February 21, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Lab3_62 abstract data type.
   */
public class Lab3_62 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a integer: ");
    long num = input.nextLong();

    System.out.println("The sum of the digits is " + sumDigits(num));
    }

    public static int sumDigits(long n) {
    int sum = 0;

    while (n != 0) {
    sum += n % 10;
    n /= 10;
    }

    return sum;
    }
}