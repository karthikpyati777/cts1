package basicsofjava.com;

public class Convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="kARTHIK";
		char[] c=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			System.out.println(c[i]);
		}
		for(int i=s.length()-1;i>=0;i--) {
			System.out.println(c[i]);
			
		}
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,6));
	}

}
