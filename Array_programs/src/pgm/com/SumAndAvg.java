package pgm.com;

public class SumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,5};
		int sum=0,avg = 0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		
			avg=sum/a.length;
		
		}
         
		System.out.println("sum of elements :"+sum);
		System.out.println("sum of avg is :"+avg);
	}

}
