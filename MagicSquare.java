public class MagicSquare {
    // magic square must be manually inputted here
    static int[][] magicSquare = {{7,6,2},{5,1,9},{8,3,4}};
    static int sum;
    public static void main(String[] args) {
        sum = 0;
        if (checkRows()) {
            if (checkColumns()) {
                if (checkDiagonals()) {
                    System.out.println("it is a magic square");
                }
            }
        }
    }

    static boolean checkRows() {
        for (int i : magicSquare[0]) {
            sum += i;
        }
        for (int y = 1; y < magicSquare.length; y++) {
            int temp = 0;
            for (int x = 0; x < magicSquare.length; x++) {
                temp += magicSquare[y][x];
            }
            if (temp != sum) {
                System.out.println("row " + y + " does not add to " + sum);
                return false;
            }
        }
        return true;
    }

    static boolean checkColumns() {
        for (int x = 0; x < magicSquare.length; x++) {
            int temp = 0;
            for (int y = 0; y < magicSquare.length; y++) {
                temp += magicSquare[y][x];
            }
            if (temp != sum) {
                System.out.println("column " + x + " does not add to " + sum);
                return false;
            }
        }
        return true;
    }

    static boolean checkDiagonals() {
        for (int n = 1; n > -2; n-=2) {
            int i = 0;
            if (n==-1) {
                i = magicSquare.length-1;
            }
            int temp = 0;
            for (int x = 0; x < magicSquare.length; x++) {
                temp += magicSquare[i + x*n][x];
            }
            if (temp != sum) {
                System.out.println("diagonal " + n + " does not add to " + sum);
                return false;
            }
        }
        return true;
    }
}
