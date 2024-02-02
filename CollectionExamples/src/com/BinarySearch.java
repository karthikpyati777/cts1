package com;

public class BinarySearch {

	private static void binseh(int[] a, int first, int last, int key) {
		// TODO Auto-generated method stub
		int mid=(first+last)/2;
		
		while(first<=last) {
			
			if(a[mid]<key)
			{
				first=mid+1;
			}
			else if(a[mid]==key) {
				System.out.println("element is found :"+mid);
				break;
			}
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
			if(first>last) {
				System.out.println("element is not found");
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a= {1,2,3,4,5};
		int first=a[0];
		int last=a.length-1;
		int key=5;
		binseh(a,first,last,key);
	}

	
	}


