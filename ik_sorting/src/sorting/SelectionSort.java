package sorting;

public class SelectionSort {

	private static int[] selectionSort(int[] arr) {

		int min;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (i != min) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 6, 10, 1, 4 };
		int[] arr1 = selectionSort(arr);

		System.out.println("Sorted Array:");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}

}
