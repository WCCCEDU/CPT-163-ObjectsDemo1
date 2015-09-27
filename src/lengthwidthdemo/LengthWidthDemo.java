/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lengthwidthdemo;

/**
 *
 * @author samuraipanzer
 */
public class LengthWidthDemo {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
	Rectangle rect = new Rectangle();
	System.out.println(rect.getWidth());
	
	Rectangle square = new Rectangle(4,4);
	System.out.println(square.getWidth());
	System.out.println(square.getLength());
	
	Area a1 = new Area(square);
	a1.calcArea();
	System.out.println(a1.getArea());
	square.scale(-2);
	System.out.println(square.getWidth());
	System.out.println(square.getLength());
	a1.calcArea();
	System.out.println(a1.getArea());
	
	
	Rectangle anotherRect = new Rectangle(8,10);
	square = anotherRect;
	a1.calcArea();
	System.out.println(a1.getArea());
  }
  
}
