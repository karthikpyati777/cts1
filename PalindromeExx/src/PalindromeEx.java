
public class PalindromeEx {

	public static <Char> void main(String[] args) {
		// TODO Auto-generated method stub
       
		String s="madam";
		char[] c=s.toCharArray();
		String rev=" ";
		for(int i=c.length-1;i>=0;i--)
		{
			rev=rev+c[i];
		}
		
		if(s.equals(rev))
		
			System.out.println("palindrome");
		
		else
		
			System.out.println("not palindrome");
		
			    
	}

}
