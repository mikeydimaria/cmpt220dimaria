import java.util.Scanner;
  public class Lab2_415 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
          char ch = input.next().charAt(0);
            int numberPushed = correspondingNumber(ch) 
           
            if (numberPushed != INVALID_KEY) {
              System.out.println("The corresponding number is " + numberPushed);
	    } else { 
		System.out.println(ch + " is an invalid input");
	    }
     }
}    
