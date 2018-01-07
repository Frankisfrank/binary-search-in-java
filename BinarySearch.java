/**
 * 
 * @author Frank
 * @date 7 Jan. 2018
 */
public class BinarySearch {

	public static void main(String[] args) {
		int n = 1000000;
		int[] array = new int[n + 1];

		for (int i = 0; i < n; i++) {
			array[i] = i;
		}

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		simpleSearch(array, n);
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);

		startTime = System.nanoTime();
		binarySearch(array, n);
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);
	}

	public static int simpleSearch(int[] sortedArray, int num) {
		for (int i = 0; i < sortedArray.length; i++) {
			if (num == sortedArray[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int binarySearch(int[] sortedArray, int num) {
		int minIndex = 0;
		int maxIndex = sortedArray.length - 1;
		int midIndex;

		while (maxIndex >= minIndex) {
			midIndex = (minIndex + maxIndex) / 2;
			int mid = sortedArray[midIndex];
			if (num == mid) {
				return midIndex;
			} else if (num < mid) {
				maxIndex = midIndex - 1;
			} else {
				minIndex = midIndex + 1;
			}
		}
		return -1;
	}
}
