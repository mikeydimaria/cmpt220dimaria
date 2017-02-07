import java.util.Scanner;
public class Lab2_41 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Length from the center to a vertex: ");
    double radius = input.nextDouble();
    input.close();
    
    // area of the pentagon
    double s = 2 * radius * Math.sin(Math.PI / 5);
    double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5)); 
    System.out.println("area of the pentagon is ");
  }
}
