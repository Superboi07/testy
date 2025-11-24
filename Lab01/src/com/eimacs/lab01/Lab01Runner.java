package com.eimacs.lab01;

import java.util.Scanner;

/**
 *
 * @author IMACS Curriculum Development Group
 * @version 3.0 (29 March, 2022)
 */
public class Lab01Runner
{public static int indexOfKeyword( String s, String keyword )
{
  // Change both s and keyword to lower case
  s = s.toLowerCase();
  keyword = keyword.toLowerCase();

  // The index of the first occurrence (perhaps embedded) of
  // keyword in s
  int startIdx = s.indexOf( keyword );

  // Check if this occurrence is embedded and look further
  // down s if it is
  while ( startIdx >= 0 )
  {
    // Find the substrings of length 1 immediately before
    // and after this occurrence. Default to the string " "
    // containing only a space.
    String before = " ", after = " ";

    if ( startIdx > 0 )
    {
      before = s.substring( startIdx - 1, startIdx );
    }

    int endIdx = startIdx + keyword.length();

    if ( endIdx < s.length() )
    {
      after = s.substring( endIdx, endIdx + 1 );
    }

    // If before and after aren't letters, this is the
    // first whole word occurrence
    if ( (before.compareTo("a") < 0 || before.compareTo("z") > 0)
          && (after.compareTo("a") < 0 || after.compareTo("z") > 0) )
    {
      return startIdx;
    }

    // This is not a whole word occurrence. Move to
    // the next occurrence.
    startIdx = s.indexOf( keyword, startIdx + 1 );
  }

  return -1;
}
    /**
     * Determines if any element of an array of Strings is a substring of a given String
     * 
     * @param s  the String within which to search
     * @param sArr  the array of Strings to look for
     * @return true if at least one element of sArr is a substring of s, false otherwise
     */
    public static boolean containsAnyOf( String s, String[] sArr )
    {
        for ( String t : sArr )
            if ( indexOfKeyword( s, t ) >= 0 )
                return true;
        return false;
    }
    
    /**
     * Gets a response chosen at random
     * 
     * @return a response chosen at random from the responses array
     */
    public static String getRandomResponse()
    {
        String[] responses =
        {
            "Interesting. Tell me more.",
            "Hmmm.",
            "Do you really think so?",
            "I see.",
            "Many people say that."
        };
        int idx = (int)(Math.random() * responses.length);
        return responses[ idx ];
    }

    /**
     * Gets an appropriate response to the input statement
     * 
     * @param statement  the String to which a response is sought
     * @return a String based on the input statement
     */
    public static String getResponse( String statement )
    {
        String [] negatives = { "no", "never", "not" };
        String[] family =
        {
            "mother", "mom", "father", "dad", "brother",
            "sister", "aunt", "uncle", "grandpa", "grandma"
        };
        String[] pets =
        {
            "cat", "dog", "parrot", "lizard", "turtle",
            "gerbil", "rabbit", "fish"
        };
        
        if ( statement.trim().length() == 0 )
            return "Please say something.";
        else if ( containsAnyOf( statement, negatives ) )
            return "Why so negative?";
        else if ( containsAnyOf( statement, family ) )
            return "Tell me more about your family.";
        else if ( containsAnyOf( statement, pets ) )
            return "Tell me more about your pets.";
        else
            return getRandomResponse();
    }
    
    /**
     * The main method
     * 
     * @param args the command line arguments
     */
    public static void main( String[] args )
    {String[] farewells = { "bye", "quit", "exit", "done" };
        System.out.println( "Chatter: Hello. Let's talk." );
        Scanner in = new Scanner( System.in );
        String statement = in.nextLine();
        
        while ( !containsAnyOf( statement, farewells ))
        {
            System.out.println( "Chatter: " + getResponse( statement ) );
            statement = in.nextLine();
        }
        
        if ( in != null )
            in.close();
    }
}