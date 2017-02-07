import java.util.Scanner
public class Lab2_45 {
  public static void main(String[] args) { 
    // Area of a regular polygon
    Scanner input = new Scanner(System.in);
    System.out.println("nubmer of sides: ");
      double numSides = input.nextDouble();
      System.out.println("Enter the side: ");
        double length = input.nextDouble();
        input.close();
          double area = (numSides * length * length) / (4.0 * Math.tan(Math.PI /          numSides));
	  System.out.println("Area of the polygon is " + area);
  }
}
