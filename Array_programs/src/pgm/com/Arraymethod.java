package pgm.com;

public class Arraymethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr= {1,4,6,8,2};
       display(arr);
	}

	static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
}
