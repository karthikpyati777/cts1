package pgm.com;

public class MaximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,78,9};
		int max=a[0];
		for(int i=-0;i<a.length;i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("maximum element is :"+max);
	}

}
