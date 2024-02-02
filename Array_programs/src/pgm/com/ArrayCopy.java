package pgm.com;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayOperation ao=new ArrayOperation();
		int[] a1= {1,2,3,6,7};
		int[] a2=ao.copyArray(a1);
		System.out.println("first Elements are");
		ao.displayArray(a1);
		System.out.println("second elements are");
		ao.displayArray(a2);
	}

}
