
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int rem,num=122,rev=0,temp;
		temp=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			 num=num/10;
		}
		if(rev==temp)
			System.out.println("palimdrome");
		else
			System.out.println("not palindrome");
	}

}
