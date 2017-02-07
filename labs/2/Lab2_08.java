import java.util.Scanner

public class Lab2_08 {
  public static void main(String[] args) {
    int number1;
    int number2;
    int number3;
    
    // input
    Scanner input = new Scanner(System.in);
    System.out.println("Enter three numbers: ");
      number1 = input.nextInt();
      number2 = input.nextInt();
      number3 = input.nextInt();
    input.close();
    
    if (number1 > number2) {
      int temp = number1;
      number1 = number2;
      number2 = temp;
      
    }
    System.out.println("Sorted Numbers: " + number1 + " " + number2 + " " + number3);
  }
}