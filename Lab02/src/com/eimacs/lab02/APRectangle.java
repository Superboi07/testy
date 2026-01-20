package com.eimacs.lab02;

/**
*
* @author |your name|
* @version 1.0 |today's date|
*/
public class APRectangle
{
   private APPoint myTopLeft;
  private double  myWidth;
  private double  myHeight;

  public APRectangle( APPoint topLeft, double width, double height )
  {
  // Insert code to initialize the instance variables here
   myTopLeft = topLeft;
   myWidth = width;
   myHeight = height;  }
  // and the modifier methods setTopLeft, setWidth, setHeight here
  // Insert code for the accessor methods getTopLeft, getWidth, getHeight
  public APPoint getTopLeft() { return myTopLeft; } 
  public double getWidth() { return myWidth; } 
  public double getHeight() { return myHeight; } 
  
  public void setTopLeft(APPoint p) { myTopLeft = p; }
  public void setWidth(double d) { myWidth = d; }
  public void setHeight(double d) { myHeight = d; }
  
  public APPoint getTopRight() { return new APPoint(myTopLeft.getX() + myWidth, myTopLeft.getY()); }
  public APPoint getBottomLeft() { return new APPoint(myTopLeft.getX(), myTopLeft.getY() + myHeight); }
  public APPoint getBottomRight() { return new APPoint(myTopLeft.getX() + myWidth, myTopLeft.getY() + myHeight); }
  
  public void shrink(double r) { 
      myWidth *= (r/100);
      myHeight *= (r/100);
  }

  public void draw( Graphics g )
  {
    APPoint topLeft = myTopLeft;
    APPoint topRight = getTopRight();
    APPoint bottomLeft = getBottomLeft();
    APPoint bottomRight = getBottomRight();

    g.drawLine( (int)topLeft.getX(), (int)topLeft.getY(), (int)topRight.getX(), (int)topRight.getY() );
    g.drawLine( (int)topRight.getX(), (int)topRight.getY(), (int)bottomRight.getX(), (int)bottomRight.getY() );
    g.drawLine( (int)bottomRight.getX(), (int)bottomRight.getY(), (int)bottomLeft.getX(), (int)bottomLeft.getY() );
    g.drawLine( (int)bottomLeft.getX(), (int)bottomLeft.getY(), (int)topLeft.getX(), (int)topLeft.getY() );
  }
}