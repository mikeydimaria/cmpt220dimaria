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
public class Lab5_732 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("First number = size of array, second number = pivot ");
    System.out.print("Enter a list:");
    int size = input.nextInt();
    int[] list = new int[size];
    for (int n = 0; n < size; n++) list[n] = input.nextInt();
    partition(list);
    }
  public static int partition(int[] list) {
    int first = 0;
    int low = first + 1;
    int high = list.length - 1;
    int pivot = list[first];
    while (high > low) {
    while (low <= high && list[low] <= pivot) low++;
    while (low <= high && list[high] > pivot) high--;
      if (high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
        }
    }
      while (high >= low && list[high] >= pivot) high--;
      if (high > first) {
      int temp = list[high];
      list[high] = list[first];
      list[first] = temp;
      return high;
        } else {
            return first;
        }
    }
}