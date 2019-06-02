import java.util.ArrayList;

public class Basic {
	// Print 1 - 255
	public int num() {
		for (int i = 0; i < 256; i++){
			return i;
		}
	}
	// Print odd numbers between 1-255
	public int odd(){
		ArrayList<Integer> oddArray = new ArrayList<Integer>();
		for(int i = 0; i < 256; i++){
			if (i % 2 == 1){
				oddArray.add(i);
			}
		}
		return oddArray;
	}
	// Print sum
	public int sum() {
		int temp = 0;
		for (int i = 0; i < 256; i++) {
			temp += i;
			i++;
		}
		return temp;
	}
	// Iterate through an array
	public int iter(int[] array) {
		for(int i = 0; i < array.length+1; i++){
			return array[i];
		}
	}
	// find max

	// Get average

	// Array with Odd number

	// Greater that y

	// Square the values

	// Eliminate Negative numbers

	// Max, Min and Average

	// Shifting the values in the Array
}




//