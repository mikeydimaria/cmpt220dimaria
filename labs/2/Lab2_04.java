import java.util.Scanner
public class Lab2_04 {
  public static void main(String[] args) {
    int randomMonth = (int) (Math.random() * 12) + 1;
    for (int i = 0; i++) {
      int randomMonth2 = (int) (Math.random() * 12) + 1;
      System.out.println(getMonth(randomMonth2) + " " + randomMonth2);
  }
  System.out,println(getMonthNow(randomMonth));
}
// month name
  public static String getMonthNow(int month) {
    String monthNow = "";
    switch (month) {
      case 0: monthNow = "January"; break;
      case 1: monthNow = "February"; break;
      case 2: monthNow = "March"; break;
      case 3: monthNow = "April"; break;
      case 4: monthNow = "May"; break;
      case 5: monthNow = "June"; break;
      case 6: monthNow = "July"; break;
      case 7: monthNow = "August"; break;
      case 8: monthNow = "September"; break;
      case 9: monthNow = "October"; break;
      case 10: monthNow = "November"; break;
      case 11: monthNow = "December"; break;
      default: monthNow = "Invalid"
    }
    return monthNow;
  }
}
