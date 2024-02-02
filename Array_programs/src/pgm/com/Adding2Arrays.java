package pgm.com;

public class Adding2Arrays {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5};
		int []b= {6,7,8,9,10};
		int x=a.length;
		int y=b.length;
		System.out.println(x+ " " +y);
		
		int c=x+y;
		int[]z=new int[c];
		
		System.out.println("enter the first elements");
		
		for(int i=0;i<x;i++) {
			z[i]=a[i];
			System.out.print(z[i]+" ");
		}
		
		System.out.println();
		
		
System.out.println("enter the 2nd elements");
		
		for(int i=0;i<y;i++) {
			z[i+x]=b[i];
			System.out.print(z[i+x]+" ");
			
		}
		
		System.out.println();
		
System.out.println("the array elements are elements");
		
		for(int i=0;i<z.length;i++) {
			System.out.print(z[i]+" ");
		}
		
		
	}
}
