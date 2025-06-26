import java.util.Random;

public class MorePrint {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        
        System.out.print("Orginal list is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");

        array = scramble(array);

        System.out.print("Shuffled list is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");

        array = quickSort(array, 0, array.length);

        System.out.print("Sorted list is: ");
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
        System.out.println("start = " + start);
        System.out.println("end = " + end);

        Random random = new Random();
        int pos = random.nextInt(end - start) + start;

        System.out.println("The pivot position is: " + pos);
        System.out.println("The pivot chosen is: " + array[pos]);

        int[] storage = new int[end - start];
        int smallAdditions = 0;
        int bigAdditions = 0;

        storage[smallAdditions] = array[pos];
        
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

        System.out.print("Storage array is: ");
        for (int i = 0; i < storage.length; i++) {
            System.out.print(storage[i] + ", ");
        }
        System.out.println("");
        
        System.out.println("sA = " + smallAdditions);
        System.out.println("lA = " + bigAdditions);

        if (smallAdditions > 1) {
            storage = quickSort(storage, 0, smallAdditions);
        } 

        if (bigAdditions > 1) {
            storage = quickSort(storage, smallAdditions + 1, end);
        }

        return storage;
    }
}