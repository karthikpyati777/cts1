package arrays.com;

import java.util.Scanner;

public class reverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
//		int sum=0;
//		int avg=0;
		System.out.println("enter the number of elements");
		int n=s.nextInt();
	
		int a[]=new int[n];
		
		System.out.println("Enter the Elements");
		for(int i=0;i<a.length;i++) {
		a[i]=s.nextInt();
		
		}
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//			avg=sum/a.length;
//		}
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
		
//		System.out.println(sum);
//		System.out.println(avg);
	}

}
