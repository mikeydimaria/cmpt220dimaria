/**
   * file: Lab3_57.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 3 
   * due date: February 21, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Lab3_57 abstract data type.
   */
public class Lab_57 {

    private static final double tuition = 10000; // tuition cost
    public static void main(String[] args) {


        double increaseRate = 0.05; // tuition percent increase rate
        double tTenYears = tuition; // tuition cost in 10 years
        double fourYearTuition = 0;
        for (int i = 0; i < 10; i++) {
            tInTenYears *= (1 + increaseRate);
        }
        fourYearTuitionCost = tInTenYears;
        System.out.println("Tuition cost in 10 years: " +
                DecimalFormat.getCurrencyInstance().format(tTenYears));
        for (int i = 0; i < 4; i++) {
            fourYearTuition *= (1 + fourYearTuitionCost);

        }
        System.out.println("Total cost of 4 years starting today: ");

    }
}