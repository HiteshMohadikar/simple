package array;

import java.util.Scanner;

public class BianarySearch {

//	public static void main(String[] args) {
//		// for 8
//		int a[] = {1,2,3,4,5,6,7,8,9};
//		Scanner sc = new Scanner(System.in);
//		int e = sc.nextInt();
//		int mid = 0;
//		int start = 0;
//		int end  = a.length-1;
//		for(int i = 1 ; i<a.length ; i++) {
//			System.out.println("itterations : " + i);
//			mid = (start+end)/2;
//			 
//			if(e == a[mid]) {
//				System.out.println("element found at" + mid);
//				return ;
//			}else if(e > a[mid]) {
//				start = mid + 1;
//			}else if(e < a[mid]) {
//				end = mid -1;
//			}else {
//				System.out.println("ELEMENT NOT PRESENT IN THE ARRAY");
//			}
//			
//		}
//		
//	}	
	
		public static void main(String[] args) {
			int a [] = {4,5,7,8,9,15,48,79,89};
			int index = binarySearch(a , 55);
			System.out.println("ELEMENT PRESENT AT "+ index);
		}
		private static int binarySearch(int a [], int x) {
			int mid = 0;
			int s = 0;
			int e = a.length-1;
			
			while(s <= e) {
				mid = (s + e)/2;
				if(x > a[mid]) {		
				s = mid + 1;
				}else if(x < a[mid]) {
					e = mid-1;
				}else {
					return mid;
				}
			
		}
			return -1;
		}
}
