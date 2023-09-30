package MyArrays;

public class GetMissingValue {

	private int[] array;

	public GetMissingValue(int[] array) {
		this.array = array;
	}

	public int[] getMissingValues(int max, int min) {

		int expectSize = max - min - array.length + 1;
		boolean[] isPrent = new boolean[max - min + 1];
		for (int num : array) {
			if (num >= min && num <= max) {
				isPrent[num - min] = true;

			}
		}
		int[] missingValue = new int[expectSize];
		int index = 0;
		for (int i = 0; i < isPrent.length; i++) {
			if (!isPrent[i]) {
				missingValue[index] = i + min;
				index++;

			}
		}
		return missingValue;
	}

	public static void main(String[] args) {

		int max = 20;
		int min = 10;
		int[] array = { 10, 11, 12, 13, 14, 16, 17, 19, 20 };
		GetMissingValue MyArraysMissingValue = new GetMissingValue(array);
		int[] result = MyArraysMissingValue.getMissingValues(max, min);
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

}
