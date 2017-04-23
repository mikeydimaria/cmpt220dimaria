/**
   * file: BMIClass.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 7
   * due date: April 25, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * BMIClass abstract data type.
   */
public class BMIClass {
  public static void main(String[] args) {
 	BMI bmi1 = new BMI("Kim Yang", 18, 145, 5, 10);
 	System.out.println("The BMI for " + bmi1.getName() + " is "
 	  + bmi1.getBMI() + " " + bmi1.getStatus());
 	  BMI bmi2 = new BMI("Susan King", 215, 70);
 		System.out.println("The BMI for " + bmi2.getName() + " is "
 		  + bmi2.getBMI() + " " + bmi2.getStatus());
 	}
 }