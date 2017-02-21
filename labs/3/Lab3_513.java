/**
   * file: Lab3_513.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 3 
   * due date: February 21, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Lab3_513 abstract data type.
   */
public class Lab3_512 {
  public static void main(String[] args) {

  int n = 0;

  while (Math.pow(n, 3) < 12000) {
  n++;
  }

  System.out.println(n + " is the lowest number, such that n^3 is greater than 12,000");
  System.out.println("Proof: " + (n - 1) + "^3 = " + Math.pow(n - 1, 3));
  System.out.println("Proof: " + n + "^3 = " + Math.pow(n, 3));

  }
}