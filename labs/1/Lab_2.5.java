public class Lab_2.5 {
  public static void main(String[] args) {
    double gratuityRate, gratuityTotal, total, subtotal;
      Scanner input = new Scanner(System.in);
        System.out.println("Subtotal and Gratuity rate: ");
	  subtotal = input.nextDouble();
	  gratuityRate = input.nextDouble();
	    gratuityTotal = subtotal * gratuityRate * .15;
	    total = subtotal + gratuityTotal;
	      System.out.println("Gratuity is" + gratuityTotal + "total is" + total);
  }
}
