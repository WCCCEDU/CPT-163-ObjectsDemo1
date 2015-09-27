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
public class Area {
  Rectangle rect = null;
  double area;

  public Area(Rectangle rect) {
	this.rect = rect;
	this.area = 0.0;
  }
  
  public double getArea(){ return this.area; }
  
  public void calcArea(){
	this.area = this.rect.getLength() * this.rect.getWidth();
  }
}
