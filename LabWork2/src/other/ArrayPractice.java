package other;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class ArrayPractice {
	public static void main(String[] args) {
		int[] intArray = {1,2,3,4,5};
		System.out.println("Initial array is: "+Arrays.toString(intArray));
		for(int i = 0; i < intArray.length; i++) {
			if(i%2==0) {
				intArray[i] *= 2;
			}else {
				intArray[i] *= 3;
			}
		}
		System.out.println("Final array is: "+Arrays.toString(intArray));
	}
}
