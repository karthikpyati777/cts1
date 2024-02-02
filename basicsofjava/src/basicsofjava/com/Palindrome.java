package basicsofjava.com;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="AMMA";
		char[] c=s.toCharArray();
		String rev=" ";
		
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+c[i];
		}
		if(s.equals(rev))
			System.out.println("palindrome");
		else
			System.out.println("Not Palindrome");
	}

}
