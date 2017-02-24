/**
   * file: Lab4_620.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 1, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Lab4_620 abstract data type.
   */
public class Lab4_620 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter string: ");
    String s = input.nextLine();
    System.out.println("Number of letters inside string is: " + countLetters(s));
  }
  public static int countLetters(String s) {
    int letterCount = 0;
    for (int i = 0; i < s.length(); i++) {
      if (isLetter(s.charAt(i))) 
      letterCount++;
    }
    return letterCount;
    }
    public static boolean isLetter(char c) {
        c = Character.toUpperCase(c);
        return (c >= 'A' && c <= 'Z');
    }    
  }
}