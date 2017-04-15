/**
   * file: Location.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 6
   * due date: April 18, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Location abstract data type.
   */
class Location {
  public static void main(String[] args) { 
	int row;         	
	int column;			
	double maxValue;	
	int i;
	int j;
	Location(double[][] a) {
	  maxValue = a[0][0];
		row = 0;
		column = 0;
		for (i = 0; i < a.length; i++) {
		  for (j = 0; j < a[i].length; j++) {
			if (a[i][j] > maxValue) {
		      maxValue = a[i][j];
				row = i;
				column = j;
		}
	  }
    }		
  }
	}
  }