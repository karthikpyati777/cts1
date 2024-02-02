
public class UsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {12,3,4};
		int sum=0;
double avg = 0;
		//		for(int i=0;i<a.length;i++)
//		{
//			System.out.println(a[i]);
//		}
//		for(int i=a.length-1;i>=0;i--)
//		{
//			System.out.println(a[i]);
//		}
//		
		for(int d:a)
		{
			System.out.println(d);
			
			sum =sum+d;
			avg= sum/a.length;
		}
		
		System.out.println("sum of numbers :" +sum);
		System.out.println("average of sum is :" +avg);
		
		
		

	}

}
