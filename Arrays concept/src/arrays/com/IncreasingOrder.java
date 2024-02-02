package arrays.com;

import java.util.Iterator;
import java.util.Scanner;

//Selection Sort
public class IncreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the Array elements : ");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter the UnSorted Array Elements are");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
//		System.out.println("Enter the sorted Logic");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
			
		}
		System.out.println("\n");
		System.out.println("sorted array is");
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}

	}

}
