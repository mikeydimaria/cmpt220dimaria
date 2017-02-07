import java.util.Scanner;
  public class Lab2_11 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int daysMonth = 0;
    String nameMonth = "Unknown";
      System.out.println("Enter month: ");
      int month = input.nextInt();
      System.out.println("Enter year: ");
      int year = input.nextInt();

      switch (month) {
	case 1: nameMonth = "January";
		daysMonth = 31; break;
	case 2: nameMonth = "Feburary"
		if ((year % 4 == 0)) {
		  daysMonth = 29;
		} else {
		    daysMonty = 28;
	        } break;
    case 3: nameMonth = "March";
		daysMonth = 31; break;
	case 4: nameMonth = "April";
		daysMonth = 30; break;
	case 5: nameMonth = "May";
		daysMonth = 31; break;
	case 6: nameMonth = "June";
		daysMonth = 30; break;
	case 7: nameMonth = "July";
		daysMonth = 31; break;
	case 8: nameMonth = "August";
		daysMonth = 31; break;
	case 9: nameMonth = "September";
		daysMonth = 30; break;
	case 10: nameMonth = "October";
		 daysMonth = 31; break;
	case 11: nameMonth = "November";
		 daysMonth = 30; break;
	case 12: nameMonth = "December";
		 daysMonth = 31; 
    }
    System.out.println(nameMonth + " " + year + " has " + daysMonth + " days");
  }
}