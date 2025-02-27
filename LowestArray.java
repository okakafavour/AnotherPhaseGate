import java.util.Arrays;
public class ArrayLowest {
    public static void main(String... ericalli) {
        int[] number = {0, 4, 5, 6, 9, 7, 10, 9};
    	 int[] minimum = twoLowestNum(number);
       System.out.print("Two lowest numbers: " + "[" + minimum[0] + ", " + minimum[1] + "]");
    }
    
    public static int[] twoLowestNum(int[] number) {
        int[] result = {Integer.MAX_VALUE, Integer.MAX_VALUE};

        for (int count = 0; count < number.length; count++) {
           int num = number[count];
            if (num < result[0]) {
                result[1] = result[0];
                result[0] = num;
            } else if (num < result[1] && num != result[0]) {
                result[1] = num;
            }
        }
        return result;
    }
}
