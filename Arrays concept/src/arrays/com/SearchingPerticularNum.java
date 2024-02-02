package arrays.com;

import java.util.Scanner;

public class SearchingPerticularNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {12,3,4,5,656345,3456,6};
		int n;
		boolean found=false;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be search ");
		n=s.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(n==a[i]) {
				found=true;
			break;
			}
		}
		if(found) {
			System.out.println("YES,Number is present in the array");
		}
		else {
			System.out.println("NO,Number is not present in the array");
		}
		
		 
		
		
	}

}
