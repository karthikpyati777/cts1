package arrays.com;

import java.util.Scanner;

public class CreateAndInitialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the size of the array : " );
		int num=s.nextInt();
		a=new int[num];
		System.out.println("enter the number of elements");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("The Array elements are :");
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
