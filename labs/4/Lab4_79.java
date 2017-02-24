/**
   * file: Lab4_79.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 1, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Lab4_79 abstract data type.
   */
public class Lab4_79 {
  static final int size = 10;
  public static void main(String[] args) {
    double[] n = new double[size];
    Scanner input = new Scanner(System.in);
    System.out.println("Enter " + size + " numbers");
    for (int i = 0; i < n.length; i++) n[i] = input.nextDouble();
    System.out.println("The minimum number is: " + min(n));
    }
    public static double min(double[] array) {
    double min = array[0];
    for (int i = 0; i < array.length; i++) {
    if (min > array[i]) min = array[i];
  }
    return min;
  }
}