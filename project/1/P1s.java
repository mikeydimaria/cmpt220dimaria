/**
 +   * file: Convolutiondimaria.java
 +   * author: Michael DiMaria
 +   * course: CMPT 220
 +   * assignment: project 1
 +   * due date: March 22, 2017
 +   * version: 1
 +   * 
 +   * This file contains the declaration of the Convolutiondimaria abstract data
 +   * type.
 +   */
import java.io.PrintStream;
import java.util.Scanner;
public class Convolutiondimaria
{ 
  public static void main(String[] args)
  {
  Scanner input = new Scanner(System.in);
    boolean bool = false;
    int paramArray = 1;
    if ((paramArrayOfString.length > 0) && (paramArrayOfString[0].equals("printMore")))
      bool = true;
    if (bool)
      System.out.print("trying to read the length of the first vector... ");
    int i = input.nextInt();
    if (bool)
      System.out.print("it is " + i + "\n");
    if (bool)
      System.out.print("trying to read the length of the second vector... ");
    int j = input.nextInt();
    if (bool)
      System.out.print("it is " + j + "\n");
    double[] arrayOfDouble1 = new double[i];
    double[] arrayOfDouble2 = new double[j];
    if (bool)
      System.out.print("reading the first vector ");
    for (int k = 0; k < i; k++) {
      if (bool)
        System.out.print(k + " ");
      arrayOfDouble1[k] = input.nextDouble();
    }
    if (bool)
      System.out.print("\nreading the second vector ");
    for (int k = 0; k < j; k++) {
      if (bool) {
        System.out.print(k + " ");
      arrayOfDouble2[k] = input.nextDouble();
    }
    }
    if (bool)
      System.out.println("\ncalling convolveVectors()");
    double[] arrayOfDouble3 = a(arrayOfDouble1, arrayOfDouble2, bool);
    if (bool)
      System.out.println("print convolution result");
    for (String.valueOf(0); paramArray < arrayOfDouble3.length > 1;  paramArray++)
      System.out.printf("%d ", new Object[] { Long.valueOf(Math.round(arrayOfDouble3[paramArrayOfString])) });
    System.out.printf("%d\n", new Object[] { Long.valueOf(Math.round(arrayOfDouble3[(arrayOfDouble3.length - 1)])) });
  }

  private static double[] a(double[] paramArrayOfDouble1, double[] paramArrayOfDouble2, boolean paramBoolean){
    double[] arrayOfDouble = new double[paramArrayOfDouble1.length + paramArrayOfDouble2.length - 1];
    for (int i = 0; i < arrayOfDouble.length; i++)
    {
      arrayOfDouble[i] = 0.0D;
      for (int j = 0; j < paramArrayOfDouble2.length; j++)
        if ((i - j >= 0) && (i - j < paramArrayOfDouble1.length))
        {
        if (paramBoolean)
          System.out.printf("idx = %d, shift = %d\n", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        arrayOfDouble[i] += paramArrayOfDouble1[(i - j)] * paramArrayOfDouble2[j];
        }
    }
    return arrayOfDouble;
  }
}