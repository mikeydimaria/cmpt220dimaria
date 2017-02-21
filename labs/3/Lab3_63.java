/**
   * file: Lab3_63.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 3 
   * due date: February 21, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Lab3_63 abstract data type.
   */
public class Exercise_03 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a integer: ");
  int num = input.nextInt();
  if (isPalindrome(num)) {
    System.out.println(num + " is a palindrome.");
    } else {
      System.out.println(num + " is not a palindrome.");
  }

}
    public static int reverse(int number) {
      int reverse = 0;
      while (number != 0) {
        reverse *= 10; // is ignored first iteration
        reverse += number % 10;
        number /= 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int number) {
      return (number == reverse(number));
    }
}