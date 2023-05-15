package if_else;

import java.util.Scanner;

public class FindCharCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = str.charAt(0);
		System.out.println( "Char is :" +c);
		
		if(c>='A' && c<='Z') {
			System.out.println(1);
		}else if(c>='a' && c<='z'){
			System.out.println(0);
		}else {
			System.out.println(-1);
		}
		

	}

}
