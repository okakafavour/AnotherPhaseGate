import java.util.Arrays;

public class ArrayAddition {
    public static void main(String[] args) {
        int[] array1 = {3, 5, 7, 9};
        int[] array2 = {1, 2, 6, 8};

        
        int[] result = addArrays(array1, array2);

        int largest = findLargest(result);
        int smallest = findSmallest(result);

      
        System.out.println("Resulting array: " + Arrays.toString(result));
        System.out.println("Largest value: " + largest);
        System.out.println("Smallest value: " + smallest);
    }
   
    public static int[] addArrays(int[] array1, int[] array2) {
        int length = Math.min(array1.length, array2.length);
        int[] result = new int[lengt
        for (int i = 0; i < length; i++) {
            result[i] = array1[i] + array2[i];
        }
        return result;
    }

  
    public static int findLargest(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    
    public static int findSmallest(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
