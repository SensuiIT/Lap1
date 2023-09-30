package MyArrays;

import java.util.Arrays;

public class MirrorArray {

	private int[] array;

	public MirrorArray(int[] array) {
		this.array = array;
	}

	// Method mirror that outputs the contents of an array in a
	// reverse order like a mirror
	// Example: input [1, 2, 3] ==> output: [1, 2, 3, 3, 2, 1]
	public int[] mirror() {

		int[] mirrorArray = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			mirrorArray[i] = array[i];
			mirrorArray[array.length * 2 - 1 - i] = array[i];
		}
		return mirrorArray;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3 };
		MirrorArray myArray = new MirrorArray(array);
		System.out.println(Arrays.toString(myArray.mirror()));
	}
}