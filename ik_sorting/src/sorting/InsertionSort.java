package sorting;

public class InsertionSort {

	private static int[] insertionSort(int[] arr, int n) {

		for (int i = 0; i < n; i++) {
			int j = i - 1;
			int temp = arr[i];
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 6, 10, 1, 4 };
		int n = arr.length;
		int[] arr1 = insertionSort(arr, n);

		System.out.println("Insertion Sorted Array:");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}
