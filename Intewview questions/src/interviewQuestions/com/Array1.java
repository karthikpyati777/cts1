package interviewQuestions.com;

import java.util.Scanner;

public class Array1 {
	
	public static void main(String[] args) {
		
		int n;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number of elements you want to store:");
		
		n=s.nextInt();
		

		int[] arr=new int[n];
		System.out.println("Enter the Array Elements");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.println("Array Elements are");
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	
	}

}
