package sorting;

public class MergeSort {

	private static int[] mergeSortUtil(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		mergeSort(arr, start, end);
		return arr;
	}

	private static void mergeSort(int[] arr, int start, int end) {
		if (start == end) {
			return;
		}

		int mid = (start + end) / 2;
		mergeSort(arr, start, mid);
		mergeSort(arr, mid + 1, end);
		merge(arr, start, mid, end);
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int i = start;
		int j = mid + 1;
		int count = 0;

		int[] aux = new int[end - start + 1];
		while (i <= mid && j <= end) {
			if (arr[i] <= arr[j]) {
				aux[count] = arr[i];
				i++;
			} else {
				aux[count] = arr[j];
				j++;
			}
			count++;
		}

		while (i <= mid) {
			aux[count] = arr[i];
			i++;
			count++;
		}

		while (j <= end) {
			aux[count] = arr[j];
			j++;
			count++;
		}
		
		int l = 0;
		for(int k = start; k <= end; k++) {
			arr[k] = aux[l];
			l++;
		}
		
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr = { 3, 4, 6, 8, 1, 2, 5, 7 };
		mergeSortUtil(arr);

		System.out.println("Merge Sorted Array: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
