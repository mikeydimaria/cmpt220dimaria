/**
   * file: TestRectangle.java
   * author: Michael DiMaria
   * course: CMPT 220
   * assignment: Lab 6
   * due date: April 18, 2017
   * version: 1
   * 
   * This file contains the declaration of the 
   * TestRectangle abstract data type.
   */
public class TestRectangle {
  public static void main(String[] args){
  TestRectangle rectangle1 = new TestRectangle();
  TestRectangle rectangle2 = new TestRectangle();
  class Rectangle {
    double height;
    double width;
  Rectangle() {
    height = 1;
    width = 1;
    }
  Rectangle(double newHeight, double newWidth) {
    height = newHeight;
    width = newWidth;
  }
  double getArea() {
  return height * width;
  }
  double getPerimeter() {
  return 2 * (height + width);
  }
}
  }
}