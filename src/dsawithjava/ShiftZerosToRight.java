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
		
		for (int i = 0; i< numbers.length-1;i++) {
			if (numbers[i]==0) {
				numbers[i] = numbers[i+1];
				numbers[i+1]=0;
			}
			
			if(numbers[j]!=0) {
				j++;
			}else {
				if(numbers[j+1]!=0) {
					numbers[j]=numbers[j+1];
					numbers[j+1]=0;
					j++;
				}
			}
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]);
		}
		
	}

}
