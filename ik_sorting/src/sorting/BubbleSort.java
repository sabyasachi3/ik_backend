package sorting;

public class BubbleSort {

	private static int[] bubbleSort(int[] arr) {

		int n = arr.length;

		for (int i = n - 1; i >= 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 5, 6, 10, 1, 4 };
		int[] arr1 = bubbleSort(arr);

		System.out.println("Bubble Sorted Array:");
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
	
}
