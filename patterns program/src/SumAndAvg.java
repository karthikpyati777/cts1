
public class SumAndAvg {

	public static void main(String[] args) {
      
//		int sum=0;
//		double  avg=0;
//		int[] a= {1,2,3,4,5};
//		for(int i=0;i<a.length;i++)
//		{
//		     sum=sum+a[i];
//		     avg=sum/a.length;
//		    
//				
//		     
//		}
//		System.out.println(sum);
//		System.out.println(avg);
		
		
		int[] b= {1,2,3,45,3};
		int ele=2;
		int count=0;
		for(int i=0;i<b.length;i++)
		{
			if(ele==b[i])
			{
				count++;
				System.out.println("the elements are repeated are "+ele);
			
			}
		}
	}

}
