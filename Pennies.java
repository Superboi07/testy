import java.util.Scanner;
public class Pennies {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please input cents");
    recursion1(scan.nextInt(),0,0,0);
  }

  public static void recursion1(int c, int n, int d, int q) {
    recursion1(c,c,n,d,q);
  }

  public static void recursion1(int cents, int pennies, int nickles, int dimes, int quarters) {
    System.out.println(cents + " cents = " + quarters + " quarters + " + dimes + " dimes + " + nickles + " nickles + " + pennies + " pennies");
    if (pennies >= 5) {
        recursion1(cents, pennies-5, nickles+1, dimes, quarters);
        if (pennies >= 10) {
            recursion2(cents, pennies-10, nickles, dimes+1, quarters);
            if (pennies >= 25) {
                recursion3(cents, pennies-25, nickles, dimes, quarters+1);
            }
        }
    }
  }
  public static void recursion2(int cents, int pennies, int nickles, int dimes, int quarters) {
    System.out.println(cents + " cents = " + quarters + " quarters + " + dimes + " dimes + " + nickles + " nickles + " + pennies + " pennies");
    if (pennies >= 10) {
        recursion2(cents, pennies-10, nickles, dimes+1, quarters);
        if (pennies >= 25) {
            recursion3(cents, pennies-25, nickles, dimes, quarters+1);
        }
    }
  }
  public static void recursion3(int cents, int pennies, int nickles, int dimes, int quarters) {
    System.out.println(cents + " cents = " + quarters + " quarters + " + dimes + " dimes + " + nickles + " nickles + " + pennies + " pennies");
    if (pennies >= 25) {
        recursion3(cents, pennies-25, nickles, dimes, quarters+1);
    }
  }
}
t