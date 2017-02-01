public class Lab_2.6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      System.out.println("integer between 0 and 1000: ");
      int number = input.nextInt();
        int firstDigit = number % 10;
        int otherDigit = otherDigit / 10;
        int secondDigit = otherDigit % 10;
          otherDigit = otherDigit / 10;
        int thirdDigit = otherDigit % 10;
        int sum = firstDigit + secondDigit + thirdDigit;
      System.out.println("sum of all digits " + number + "is" + sum);
  }
}
