public class SumOfInteger {
 public static void main(String...args){
 
 int input = 30;
 System.out.println(number(input));
   }
   public static int number(int input){
   int result = 0;
   for (int count = 0; count <= input; count++){
      if(count % 3 == 0){
       result += count;
        }
      }
      return result;
    }   
  }

