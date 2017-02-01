public class Lab_2.1 {
    public static void main(String[] args) { 
      Scanner input = new Scanner(System.in);
    System.out.println("Enter a degree in Fahrenheit: ");
      double farenheit = input.nextDouble(9.0 / 5.0) * celsius + 32.0;
      double celsius = input.nextDouble();
    System.out.println(celsius + "Celsius " + " is " + farenheit + " in Farenheit");
  }
}