import java.util.Scanner
  public class Lab2_48 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter ASCII code: ");
          int number = input.nextInt();
            input.close();
              System.out.println("Character for ASCII code " + number + " is " 
	      (char) number);
  }
}
