/**
   * file: Lab5_720.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 5
   * due date: March 28, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Lab5_720 abstract data type.
   */
import java.util.Scanner;
public class Lab5_720 {
  static final int SIZE = 10;
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] numbers = new double[Size];
      System.out.print("Enter " + Size + " numbers: ");
      for (int n = 0; n < numbers.length; n++) numbers[n] = input.nextDouble();
      selectionSort(numbers);
      printArray(numbers, 10);
    }
  public static void selectionSort(double[] numbers) {
    for (int n = numbers.length - 1; n > 1 ; n--) {
      int currentIndex = n;
      double currentHigh = numbers[n];
    for (int k = n - 1; k > 0; k--) {
      if (currentHigh < numbers[k]) {
        currentIndex = k;
        currentHigh = numbers[k];
        }
    }
      if (currentIndex != n) {
        double temp = numbers[currentIndex];
        numbers[currentIndex] = numbers[n];
        numbers[n] = temp;
        }
    }
}
  public static void printArray(double[] array, int numberPerLine) {
    for (int n = 0; n < array.length; n++) {
      System.out.printf("%5.2f ", array[n]);
      if ((n + 1) % numberPerLine == 0) System.out.println("");
    }
  }
}