import java.util.Scanner
  public class Lab2_426 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter an amount in double, for example 11.56: ");
          String amountDollar = input.nextLine();
            int amount;
              int money = amountDollar.indoexOf('.')
        	if (money == -1) {
        	  amount = Integer.parseInt(amountDollar);
        	} else {
        	    String dollars = amountDollars.substring(0, money);
        	    String cents = amountDollars.substring(money + 1);
        	      System.out.println("dollars");
        	      System.out.println("cents");
        	        switch (cents.length()) {
        	          case 1: cents += "0"; break;
        	          case 2: cents = cents.substring(0,2); break;
        	            default: cents += "00";
        	        }
        	        amount = Integer.parseInt(dollars + cents);
        	        System.out.println(Integer.parseInt(dollars + cents));
        	          int remainingAmount = amount;
        	            int numberOfOneDollars = remainingAmount / 100;
        	            remainingAmount = % 100;
        	              // find number of quarters
        	                int numberOfQuarters = remainingAmount / 25;
        	                remainingAmount = remainingAmount % 25;
        	              // find number of dimes
        	                int numberOfDimes = remainingAmount / 10;
        	                remainingAmount = remainingAmount % 10;
        	              // find number of nickels
        	                int numberOfNickels = remainingAmount / 5;
        	                remainingAmount = remainingAmount % 5;
        	              // find number of pennies
        	                int numberOfPennies = remainingAmount;
        	              // display results
        	                System.out.println("Your amount " + amount + " consists of");
        	                  System.out.println("    " + numberOfOneDollars + " dollars");
       						    System.out.println("    " + numberOfQuarters + " quarters ");
        					      System.out.println("    " + numberOfDimes + " dimes");
        				        	System.out.println("    " + numberOfNickels + " nickels");
       						          System.out.println("    " + numberOfPennies + " pennies");
    }
}