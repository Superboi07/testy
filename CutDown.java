import java.util.Random;

public class CutDown {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("");
        array = scramble(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("");
        array = quickSort(array, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static int[] scramble(int[] array) {
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int currentNumber = random.nextInt(i);
            int lastNumber = array[i];
            array[i] = array[currentNumber];
            array[currentNumber] = lastNumber;
        }
        return array;
    }

    public static int[] quickSort(int[] array, int start, int end) {
        Random random = new Random();
        int pos = random.nextInt(end - start) + start;
        System.out.println(pos);
        int[] storage = new int[array.length];
        int smallAdditions = 0;
        int bigAdditions = 0;
        for (int i = start; i < end; i++) {
            if (!(i == pos)) {
                if (array[i] < array[pos]) {
                    storage[smallAdditions] = array[i];
                    smallAdditions++;
                } else {
                    storage[end - bigAdditions - 1] = array[i];
                    bigAdditions++;
                }
            }
        }
        storage[smallAdditions] = array[pos];
        if (smallAdditions > 1) {
            storage = quickSort(storage, 0, smallAdditions);
        } 
        if (bigAdditions > 1) {
            storage = quickSort(storage, smallAdditions + 1, array.length);
        }
        return storage;

    }
}