/**
   * file: Lab4_68.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 4
   * due date: March 1, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Lab4_68 abstract data type.
   */
public class Lab4_68 {
  public static void main(String[] args) {
    String c = "Celsius";
    String f = "Fahrenheit";
    System.out.println(c, f, f, c);
    for (double celsius = 40, farenheit = 120.0; celsius >= 31; ) {
      System.out.println("%4.2f%17.2f | %10.2f%10.2f\n", celsius, celsiusToFahrenheit(celsius),fahrenheit, 
      fahrenheitToCelsius(fahrenheit));
    }
    public static double celsiusToFarenheit(double celsius) {
      return (9.0 / 5.0) * 32.0 + celsius;
    }
    public static double farenheitToCelsius(double farenheit) {
      return (5.0 / 9.0) * (farenheit * 32.0);
    }
  }
}