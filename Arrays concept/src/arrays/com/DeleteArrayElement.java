package arrays.com;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,3,6,2,9};
		Scanner s=new Scanner(System.in);
		int b[]=new int[a.length-1];
		
		System.out.println("Enthe the index number :");
		
		int index=s.nextInt();
		
		for(int i=0,k=0;i<a.length;i++) {
			if(i==index) {
				continue;
			}
			b[k]=a[i];
			k++;
			
		}
		System.out.println("after deleted element in the array : "+Arrays.toString(b));
	}

}
