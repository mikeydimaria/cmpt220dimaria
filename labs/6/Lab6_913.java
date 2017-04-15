/**
   * file: Lab6_913.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 5
   * due date: March 28, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Lab6_913 abstract data type.
   */
import java.util.Scanner;
public class Lab6_913 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of rows and columns in the array: ");
    int row = input.nextInt();
    int column = input.nextInt();
    double[][] m = new double[row][column];
    System.out.println("Enter the array:");
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        m[i][j] = input.nextDouble();
      }
  }
    Location location = Location.locateLargest(m);
      System.out.println("The location of the largest element is "
      + location.maxValue + " at (" + location.row + ", " + location.column + ")");
  }
}

  