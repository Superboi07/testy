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
        APRectangle r = new APRectangle( new APPoint( 37.5, 17.3 ), 12.6, 42.2 );
        System.out.println( printAPRectangle( r ) );
        System.out.println( "top right: " + printAPPoint( r.getTopRight() ) );
        System.out.println( "bottom left: " + printAPPoint( r.getBottomLeft() ) );
        System.out.println( "bottom right: " + printAPPoint( r.getBottomRight() ) );
        r.shrink( 60 );
        System.out.println( "shrunk to 60%: " + printAPRectangle( r ) );
    }

    public static String printAPPoint(APPoint p){ return "(" + p.getX() + "," + p.getY() + ")"; }
    public static String printAPRectangle(APRectangle r) { return "[APRectangle " + printAPPoint( r.getTopLeft() ) + " " + r.getWidth() + "," + r.getHeight() + "]"; }
}