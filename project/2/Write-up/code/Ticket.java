import java.util.Scanner;
import java.util.Arrays;
public class Ticket {
  public static void main(String[] args) {
    //prompt user to enter amount of ticket to buy between 1 and 9
    System.out.print("How many tickets would you like to purchase for New York Knicks vs Boston Celtics? ");  
    Scanner input = new Scanner (System.in);
    double ticket_amount;
    ticket_amount = input.nextInt();
    if (ticket_amount > 10 || ticket_amount <= 0) {
      System.out.println("Number should be positive or less than 11, try again");
      while (!input.hasNextInt()) {
        input.next();
      }
      ticket_amount = input.nextInt();
    }
    //creating an Array of 1 number
    int seats[] = new int[1];

  for (int ticketNo = 0; ticketNo < ticket_amount; ticketNo++){
    for(int i = 0; i < seats.length; i++) {
        seats[i] = 1 + (int) (Math.random() * 56);
    }    

    //sort the elements
    Arrays.sort(seats);

    //row number 
    int row = 1 + (int) (Math.random()*46);

    //print the ticket numbers numbers
    System.out.println("Your seat ticket numbers are " + Arrays.toString(seats) 
        + " your row ticket number is " + row);
    }
  }
}
