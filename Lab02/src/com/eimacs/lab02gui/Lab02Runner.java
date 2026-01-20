package com.eimacs.lab02gui;

import com.eimacs.lab02.APPoint;
import com.eimacs.lab02.APRectangle;

import javax.swing.JFrame;

/**
 *
 * @author |your name|
 * @version 1.0 |today's date|
 */
public class Lab02Runner
{
    /**
     * The main method
     * 
     * @param args the command line arguments
     */
    public static void main( String[] args )
    {
      JFrame frame = new JFrame( "AP Lab 02" );
      frame.getContentPane().add( new APCanvas() );
      frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      frame.pack();
      frame.setSize( 480, 504 );
      frame.setLocation( 100, 100 );
      frame.setVisible( true );
    }

    public static String printAPPoint(APPoint p){ return "(" + p.getX() + "," + p.getY() + ")"; }
    public static String printAPRectangle(APRectangle r) { return "[APRectangle " + printAPPoint( r.getTopLeft() ) + " " + r.getWidth() + "," + r.getHeight() + "]"; }
}