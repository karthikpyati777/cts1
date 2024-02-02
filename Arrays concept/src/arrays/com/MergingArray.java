package arrays.com;

public class MergingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int b[]= {4,5,6};
	    int x=a.length;
	    int y=b.length;
		int z=x+y;
		int[] c=new int[z];
		//first array elements are
		System.out.println("Elements of the Array A");
		for(int i=0;i<x;i++) {
			System.out.print(a[i]+" ");
			c[i]=a[i];
		}
		//second array elements are
		
		System.out.println("\n");
		System.out.println("Elements of the Array B");
		for(int i=0;i<y;i++) {
			System.out.print(b[i]+" ");
			c[i+x]=b[i];
		}
		
		System.out.println("\n");
		System.out.println("merge of two elements are :s");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	

		
	}

}
