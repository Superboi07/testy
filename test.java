import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String args[]) {
       String[] huh = new String[1];
       String hi = "h";
       String[] he = huh;
       huh[0] = hi;
       System.out.println(hi);
       System.out.println(huh[0]);
       System.out.println(he[0]);
       hi = "g";
       System.out.println(hi);
       System.out.println(huh[0]);
       System.out.println(he[0]);
       hi = "g";
       System.out.println(hi);
       System.out.println(huh[0]);
       System.out.println(he[0]);
       huh[0] = hi;
       System.out.println(hi);
 System.out.println(huh[0]);
       System.out.println(he[0]);
    }
    public static void removeConsectutiveDuplicates(ArrayList<String> lst) {
        for (int i = lst.size() - 1; i > 0; i--) {
            if (lst.get(i).equals(lst.get(i-1))) {
                lst.remove(i);
            }
        }
    }
}

/*
     0
    00
   000
  0000
 00000
000000
*/