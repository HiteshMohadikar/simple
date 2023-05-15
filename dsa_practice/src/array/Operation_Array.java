package array;

import java.util.Arrays;

public class Operation_Array {

	public static void main(String[] args) {
		
		//int a[] = {1,2,3,4,5,6,7,8,9};
		
		//-- For Reverse The Array
//		for(int i = a.length-1 ;  i < a.length ; i--) {
//			
//			if(i>-1)
//			System.out.println( "value of i =" + i + "------------>" + a[i]);
//			
//		}
		
		
		//--min and max from the array
//		int min = 0;
//		int max = 0;
//		
//		for(int i = 0 ; i < a.length ; i++) {
//			
//			if( min > a[i]) {
//				min = a[i];
//			}
//			
//			if(max < a[i]) {
//				max = a[i];
//			}
//		}
//		System.out.println("min is ------> "+ min +"\n"+ "max is ------->" + max);
//		int[] arr = {7, 10, 4, 3, 20, 15};
//		int k = 3;
//		Arrays.sort(arr);
//		System.out.println(arr[k-1]);
			
		int arr[]= {0,2,1,2,0};
		int zero = 0 ;
		int one = 0;
		int two = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			//for zero
			if (arr[i] == 0) {
				zero++;
				}
			if(arr[i] == 1) {
				one++;
			}
			if(arr[i] == 2) {
				two++;
			}
			}
		//System.out.println("----------->" + zero);
		for(int x = 1 ; x<=zero ; x++) {
			System.out.println(0);
		}
		
		//System.out.println("----------->" + one);
		for(int x = 1 ; x <= one ; x++) {
			System.out.println(1);
		}
		
		//System.out.println("---------->" + two);
		for(int x = 1 ; x<=two ; x++) {
			System.out.println(2);
		}
			}
		}
	
				
			
	


		