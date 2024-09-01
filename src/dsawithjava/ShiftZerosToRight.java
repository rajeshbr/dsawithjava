/**
 * 
 */
package dsawithjava;

/**
 * 
 */
public class ShiftZerosToRight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] numbers = {9,8,0,2,0,0,0,7,2};
		
		
		int j=0;
		
		for (int i = 0; i< numbers.length;i++) {
			if (numbers[i]!=0 && numbers[j]==0) {
				int temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j]=temp;
			}
			
			if(numbers[j]!=0) {
				j++;
			}
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i] + " ");
		}
		
	}

}
