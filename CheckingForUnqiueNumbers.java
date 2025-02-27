public class CheckingForUniqueElement{
	public static void main(String [] args){
	int[] array = {1,2,3,2};
	System.out.println(number(array));
 }
 
 public static int number(int[] array){
	int unique =0;
		int[] oneForUnique = new int[array.length];
	for(int count =0; count < array.length; count++){
	 for(int count1 = 0; count1 < array.length; count1++){
	   if(array[count] == array[count1]){
	   unique++;
     }
  }
	 oneForUnique[count]=unique;
    }
	int result = 0;
	for(int count2 = 0; count2 < array.length; count2++){
	if(oneForUnique[count2] == 1){
	result = array[count2];
       
       }
    }
	return result;
  }
}
