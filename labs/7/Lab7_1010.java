/**
   * file: Lab7_1010.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 7
   * due date: April 25, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * Lab7_1010 abstract data type.
   */
public class Lab7_1010 {
  public static void main(String[] args) {
	Queue queue = new Queue();
      for (int i = 1; i <= 20; i++) {
		queue.enqueue(i);
	 }
	  while (!queue.empty()) {
		System.out.print(queue.dequeue() + " ");
	  }
	  System.out.println();
	}
}