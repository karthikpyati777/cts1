
public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153,temp=n,r,sum=0;
         while(n>0)
         {
        	 r=n%10;
        	 sum=sum+r*r*r;
        	 n=n/10;
         }
         if(temp==sum)
        	 System.out.println("amstrong number");
         else
        	 System.out.println("not amstrong number");
	}

}
