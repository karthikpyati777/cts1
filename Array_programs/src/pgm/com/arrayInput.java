package pgm.com;

import java.util.Scanner;

public class arrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		int[] a=new int[5];
		System.out.println("defulat values are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("enter the values :");
		for(int i=0;i<a.length;i++)
		{
		a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}

}
