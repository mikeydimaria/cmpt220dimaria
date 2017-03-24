import java.util.Scanner;
/**
   * file: Lab5_732.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 5
   * due date: March 28, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Lab5_732 abstract data type.
   */
public class Lab5_813 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.printf("Enter the number of rows and columns of the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] m = new double[row][column];
    System.out.println("Enter the array below: ");
    for (int b = 0; b < row; b++)
      for (int k = 0; k < column; k++)
        m[b][k] = input.nextDouble();
        int[] location = locateLargest(m);
        System.out.printf("The location of the largest element is at (%d, %d)\n", location[0], location[1]);
    }
    public static int[] locateLargest(double[][] a) {
      int[] location = new int[] { 0, 0 };
      double largest = a[0][0];
      for (int b = 0; b < a.length; b++) {
        for (int k = 0; k < a[b].length; k++) {
          if (a[b][k] > largest) {
            location[0] = b; // row
            location[1] = k; // column
            largest = a[b][k];
          }
      }
    }
      return location;
  }
}