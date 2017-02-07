import java.util.Scanner;

public class Lab2_315 {
  public static void main(String[] args) {
    // lottery generator
    int lottery = (int) (Math.random() * 1000);
    // Guessing
    Scanner input = new Scanner(System.in);
      System.out.println("Enter guess (Three digits): ");
        int guess = input.nextInt();
    // digits in lottery
    int lotteryDigit1 = lottery / 100;
      int lotteryDigit2 = lottery % 100 / 10;
        int lotteryDigit3 = lottery % 10;  
    // get numbers from guess
    int guessDigit1 = lottery / 100;
      int guessDigit2 = lottery % 100 / 10;
        int guessDigit3 = lottery % 10;
          System.out.println("Lottery number is " + lottery);
    // check guess
    if (guess == lottery) {
      System.out.println("Exact Match: you win $10,000");
    } else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2
	   && guessDigit3 == lotteryDigit3 || guessDigit1 == lotteryDigit1 &&   
	    guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigi2 || 
	      guessDigit3 == lotteryDigit1 && guessDigit1 == lotteryDigit3 && 
	       guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit1 &&                 
	         guessDigit3 == lotteryDigit2 && guessDigit1 == lotteryDigit3 || 
	 		   guessDigit3 == lotteryDigit1 && guessDigit1 == lotteryDigit2 && 
	 		     guessDigit2 == lotteryDigit3) {
       System.out.pringln("Match all digits: you win $3,000");
    } else if (guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 ||
	  guessDigit2 == lotteryDigit1 || guessDigit1 == lotteryDigit1 || 
	    guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 ||
	      guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || 
	        guessDigit3 == lotteryDigit3) {
              System.out.println("Match one Digit: you win $1,000"); 
    } else {
	System.out.println("No Match");
    }
  }
}  
