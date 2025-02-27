public class GreatestCommonDivisor{
public static void main(String[] args) {

int intergerOne = 2;
int intergerTwo = 4;
   int result = 0;
System.out.print(getGreatestCommonDivisor(intergerOne, intergerTwo));
  }
  public static int getGreatestCommonDivisor(int intergerOne, int intergerTwo){
   int result = 0;
for (int count = 1; count <= intergerOne && count <= intergerTwo; count++){
 if (intergerOne % count == 0 && intergerTwo % count == 0){
  result = count;
     }
  }
return result;
   }

}
