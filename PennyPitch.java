import java.util.Random;
import java.util.Scanner;
public class PennyPitch {
  static int[][] board = new int[5][5];
  static Random rand = new Random();
  static Scanner scan = new Scanner(System.in);
  public static void main(String[] args) {
      System.out.println("Please input how many rounds:");
      int rounds = scan.nextInt();
      int score = 0;
      makeBoard();
      printBoard();
      while (rounds>0) {
        int x = rand.nextInt(5);
        int y = rand.nextInt(5);
        score += board[y][x];
        board[y][x]=0;
        printBoard();
        rounds--;
      }
      System.out.println("The score is " + score);
  }

  static void makeBoard() {
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (i==0||i==4||j==4||j==0) board[i][j]=1;
        else if (i==1||i==3||j==3||j==1) board[i][j]=2;
        else board[i][j]=3;
      }
    }
  }

  static void printBoard() {
    for (int[] ii : board) {
      for (int i : ii) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
}