package pgm.com;

import java.util.Scanner;

public class ReadArrayFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		 int[] a=null;
		 
		 //ask the length
		 System.out.println("enter the length of the array :");
		 int len=s.nextInt();
		 
		 //assign size to the array
		 
		 a=new int[len];
		 
		 //take the input values
		 System.out.println("enter the value:");
		 for(int i=0;i<a.length;i++) {
			 a[i]=s.nextInt();
		 }

		 System.out.println("display the array elements ");
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }
	}

}
