public class Lab2_425 {
  public static void main(String[] args) {
    myString s = new myString();
      for (int i = 0; i < 3; i++) {
        char ch = (char)(Math.random() *26 + 'A');
    }
      for (int i = 0; i < 4; i++) {
        char number1 = (char)(Math.random() * 10 + '0');
      }
      System.out.println("Random vehicle plate number: " + s);
  }
}
