package pgm.com;

import java.util.Scanner;

public class TakeInputArrayFromEndUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a=readArray();
		System.out.println("array elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

	static int[] readArray()
	{
		int n=0;
		int[] a=null;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elementsn is :");
		n=s.nextInt();
		a=new int[n];
		
		System.out.println("enter the element :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		s.close();
		return a;
		
	}
}
