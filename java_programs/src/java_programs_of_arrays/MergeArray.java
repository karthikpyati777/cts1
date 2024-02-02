package java_programs_of_arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3};
		int b[]= {4,5,6};
		int x=a.length;
		int y=b.length;
		int z=x+y;
		int c[]=new int[z];
		
		System.out.println("1st array elements contain ");
		for(int i=0;i<x;i++) {
			System.out.print(a[i]+" ");
			c[i]=a[i];
		}
		System.out.println();
		System.out.println("2nd array elements contain ");
		for(int i=0;i<y;i++) {
			System.out.print(b[i]+" ");
			c[i+x]=b[i];
		}
		
		System.out.println();
		System.out.println("merge Elements are");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
