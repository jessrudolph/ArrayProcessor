
/**
 * 
 * @author Jess Rudolph
 *
 */

public class ArrayProcessor {

	public static void main(String[] args) {		
		int[] array = {10, 34, 61, 210, 55, 20, 7, 23, 82};
		
		processArray(array);
		
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + ", ");
		}
	}
	
	public static int[] processArray(int[] array) {
		for(int i = 0; i < array.length; i++){
			boolean bool = false;
			
			if (i > 0){
				if(i % 2 == 0){
				array[i] = array[i] + array[i - 1];
				bool = true;
				}
				if(i % 3 == 0 && ((i + 1) < array.length)){
				//Swap array[i] and array[i + 1]
				int indexOne = array[i];
				int indexTwo = array[i+1];
				array[i] = indexTwo;
				array[i+1] = indexOne;
				bool = true;
				}
				if(i % 5 == 0){
				array[i] = array[i] * 2;
				bool = true;
				}
				if (!bool){
				array[i] = array[i] - 1;
				}
			}
			else{
			array[i] = array[i] - 1;
			}
		}
		return array;
	}
}
