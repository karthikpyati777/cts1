package com.basic.javapgms;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//		System.out.println();
		
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int k=n;k>=1;k--) {
//			for(int j=1;j<k;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
