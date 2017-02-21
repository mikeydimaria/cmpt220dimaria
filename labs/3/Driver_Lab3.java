import java.util.Scanner;
import java.lang.*;
public class Driver_Lab3 {
public static void main (String[] args) {
		
  double x1;
  double y1;
  double x2;
  double y2; 
  double p; // coordinates of two points
  double distance; // distance between the points
  int count = 0;
  Scanner input = new Scanner(System.in);

    x1 = input.nextDouble();

    y1 = input.nextDouble();

    x2 = input.nextDouble();

    y2 = input.nextDouble();

    p = input.nextDouble();
    
    distance = Math.pow(Math.pow(Math.abs(x1-x2), p) + Math.pow(Math.abs(y1-y2), p), 1/p);
    
    
    System.out.println(distance);
  
  } 
}