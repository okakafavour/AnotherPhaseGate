public class LargsetArray {
    public static void main(String... args) {
        int[] number = {1, 4, 5, 6, 9, 7, 10, 9};
        int[] maximum = twoHighestNum(number);
        System.out.print("Two highest numbers: " + "[" + maximum[0] + ", " + maximum[1] + "]");
    }
    
public static int[] twoHighestNum(int[] number) {
int[] result = {Integer.MIN_VALUE, Integer.MIN_VALUE};
      for (int num : number) {
          if (num > result[0]) {
             result[1] = result[0];
               result[0] = num;
            } else if (num > result[1] && num != result[0]) {
                result[1] = num;
            }
        }
        return result;
    }

}
