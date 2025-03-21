package ex06;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] {31,72,32,66,15,1,61,24,59,38,71,35,10,96,84,78,65,60,11,47};
		System.out.print("未排序陣列->");
		printArray(arr);
		qSort(arr, 0, arr.length - 1);
		System.out.print("\n排序後陣列->");
		printArray(arr);
	}
	static void printArray(int[] a) {
		for(int i = 0; i < a.length; i ++)
			System.out.print(a[i] + " ");
	}
	static void qSort(int[] a, int m, int n) {
		if (m >= n)
			return;
		int i = m, j = n, pivot = a[(m + n) / 2];
		while (i <= j) {
			while (a[i] < pivot) {
				i ++;
			}
			while (a[j] > pivot) {
				j --;
			}
			if (i < j) {
				int t = a[i];
				a[i] = a[j];
				a[j] = t;
				i ++;
				j --;
			} 
			else if (i == j) {
				i ++;
			}
		}
		qSort(a, m, j);
		qSort(a, i, n);
	}
}
