public class Sorts
{
   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using the selection
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static int[] selectionSort (int[] numbers)
   {
      int[] nums = new int[2];

      int min=0;
      int temp=0;

      for (int index = 0; index < numbers.length-1; index++)
      {
         min = index;
         for (int scan = index+1; scan < numbers.length; scan++) {
            nums[0]++;
            if (numbers[scan] < numbers[min]) {
               min = scan;
            }
         }
         if(min!=index){
         // Swap the values
         nums[1]++;
         temp = numbers[min];
         numbers[min] = numbers[index];
         numbers[index] = temp;
         }
      }
      return nums;
   }
   //-----------------------------------------------------------------
   //  Sorts the specified array of integers using the insertion
   //  sort algorithm.
   //-----------------------------------------------------------------
   public static int[] insertionSort (int[] numbers)
   {
      int[] nums = new int[2];
      for (int index = 1; index < numbers.length; index++)
      {
         int key = numbers[index];
         int position = index;

         // shift larger values to the right
         nums[0]++;
         while (position > 0 && numbers[position-1] > key)
         {
            nums[1]++;
            numbers[position] = numbers[position-1];
            position--;
            nums[0]++;
         }
         nums[1]++;
         numbers[position] = key;
      }
      return nums;
   }
  
}