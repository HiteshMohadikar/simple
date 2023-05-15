package array;

public class SelectionSort {
	
//	public static void printArray(int a[]) {
//		for(int i = 0 ; i < a.length ; i++) {
//			System.out.println(a[i]);
//		}
//	}
//	
//	public static void sealectionSort(int a[]) {
//		int n = a.length;
//		for(int i = 0;i< n-1; i++) {
//			int min = Integer.MAX_VALUE;
//			int minIndex = i;
//			for(int j = i ; j < n ; j++) {
//				if(min > a[j]) {
//					min = a[j];
//					minIndex = j;
//				}
//				int temp = a[minIndex];
//				 a[minIndex] = a[i]; 
//				a[i] = temp;
//			}
//		}
//	}
//	
//	public static void main(String[] args) {
//		int a [] = {9,8,7,6,5,4,3,2,1};
//		sealectionSort(a);
//		printArray(a);
//
//	}
	
	public static void sortarray(int a[]) {
		int n = a.length;
		for(int i = 0 ; i<n-1 ; i++) {
			int min = Integer.MAX_VALUE;
			int minIndex = 0;
			for(int j = i ; j < n ; j++) {
				if(min > a[j]) {
					min = a[j];
					minIndex = j;
				}
				int temp = a[minIndex];
				a[minIndex] = a[i];
				a[i] = temp;
			}
		}
	}`
	
	public static void main(String[] args) {
		int a[] = { 7,52,8,21,56,9,4,0};
		sortarray(a);
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
	}

}
