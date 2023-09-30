package MyArrays;

import java.util.ArrayList;

public class RemoveDuplicates {
	private int[] array;

	public RemoveDuplicates(int[] array) {
		// TODO Auto-generated constructor stub
		this.array = array;
	}

	// removes all duplicate elements from an array and returns a
	// new array
	//Input: 1 3 5 1 3 7 9 8
	//Output: 1 3 5 7 9 8
	
	public int[] removeDuplicates() {

		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int temp : array) {
			if (!arrayList.contains(temp)) {
				arrayList.add(temp);
			}
		}
		int[] uniqueArray = new int[arrayList.size()];
		for (int i = 0; i < arrayList.size(); i++) {
			uniqueArray[i] = arrayList.get(i);
		}
		return uniqueArray;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 3, 5, 1, 3, 7, 9, 8 };
		RemoveDuplicates remove = new RemoveDuplicates(array1);
		int[] result = remove.removeDuplicates();
		for (int temp : result) {
			System.out.print(temp + " ");

		}
	}
}
