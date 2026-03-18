
import java.util.Scanner;

public class EquilateralTriangle {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //System.out.println("What is the side length of the " + "equilateral triangle?");
        int height = 7;
    
    for (int i = 0; i < height; i++){
      for (int j = 0; j < height - i; j++){
        System.out.print(" ");
      }
      for (int k = 0; k < i + 1; k++){
        System.out.print("* ");
      }
      System.out.println();
    }


    //Bottom Half (Reverse Equilateral Triangle) 
    for (int i = 1; i < height; i++){
      for (int j = 0; j < i + 1; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < height - i; k++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}