import java.util.Scanner;

public class AsscciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		
//		int ascciivalue=(int)'w';
//		
//		System.out.println("assciivalue value of :" +ascciivalue);
		
//		System.out.println("enter the charcter");
////		
//		Scanner sc=new Scanner(System.in);
//		char ch=sc.next().charAt(0);
//		int a=ch;
//		System.out.println("value of : ch "+a);
//		
//		int rem,sum=0,n = 121;
//		int num;
//		int temp=n;
//		while(n>0)
//		{
//			rem=n%10;
//			sum=sum*10+rem;
//			num=n/10;
//		}
//		
//		
//		if(sum==temp)
//			System.out.println("palindrome");
//		else
//			System.out.println("not palindrome");
//		
		
//		int a=10,b=12,c=20;
//		if(a>b&& a>c)
//		{
//			System.out.println("a is the largest "+a);
//			
//		}
//		else if(b>a && b>c)
//		{
//			System.out.println("b is the largest"+b);
//		}
//		else
//		{
//			System.out.println("c ithe largest"+c);
//		}
		
		
//		System.out.println("enter the first number");
//		 a=sc.nextInt();
//		 System.out.println("enter the second numbe");
//		 b=sc.nextInt();
//		 System.out.println("enter the third numbe");
//		 c=sc.nextInt();
////			 
////			 temp=a<b?a:b;
////			 smallest=c<temp?c:temp;
//		 temp=a>b?a:b;
//		 largest=c>temp?c:temp;
//		 System.out.println("largest number is "+largest);
		
		int[] a= {1,2,3,4,5};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println();
	}

}
