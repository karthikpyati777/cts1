package basicsofjava.com;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the name :");
		//String a=s.next();
		//String a=s.nextLine();
		char a=s.nextLine().charAt(8);
		System.out.println("The Name is : " + a);
		
	}

}
