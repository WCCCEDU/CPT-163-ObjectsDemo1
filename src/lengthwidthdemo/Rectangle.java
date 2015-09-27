/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lengthwidthdemo;

/**
 * Two dimensional object whose opposing sides are the same length and has right
 * angles
 * @author Paul Scarrone
 */
public class Rectangle {
  private double length, width;
  
  public Rectangle(){
	this.length = 0.0;
	this.width = 0.0;
  }
  
  public Rectangle(double length, double width){
	this.length = length;
	this.width = width;
  }
  
  public double getLength(){ return this.length; }
  public double getWidth(){ return this.width; }
  
  /**
   * Uniformly Scales the size of the rectangle
   * @param scale a factor by which the side of the rectangle with be adjusted
   */
  public void scale(double scale){
	this.length += scale;
	this.width = this.width + scale;
  }
}
