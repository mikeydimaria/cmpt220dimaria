/**
   * file: Lab4_718.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 1, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Lab4_718 abstract data type.
   */
public class Lab4_718 {
  public static void main(String[] args) {
    double[] numbers = new double[100];
    for (int i = 0; i < numbers.length ; i++) {
      numbers[i] = Math.random() * 200;
  }
    bubbleSort(numbers);
    printArray(numbers, 10);
    }
    public static void printArray(double[] array, int numberLine) {
    for (int i = 0; i < array.length; i++) {
      System.out.printf("%4.0f ", array[i]);
      if ((i + 1) % numberLine == 0) System.out.println("");
      }
    }
    public static void bubbleSort(double[] numbers) {
      boolean change;
      do {
      order = false;
      for (int i = 0; i < numbers.length - 1; i++) {
      if (numbers[i] > numbers[i + 1]) {
      double temp = numbers[i];
      numbers[i] = numbers[i + 1];
      numbers[i + 1] = temp;
      order = true;
    }
      }
        } while (order);
  }
}