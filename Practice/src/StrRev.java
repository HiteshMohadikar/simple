
public class StrRev {

	public static void main(String[] args) {
		
		String str = "1234567890";
		String s = "";
		
		char[] c = str.toCharArray();
		
		for(int i = c.length-1 ; i<c.length ; i--) {
			if(i >= 0) {
				s = s + c[i];
			}
		}
		System.out.println(s);
	}

}
