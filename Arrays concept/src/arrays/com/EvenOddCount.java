package arrays.com;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,4,6,5,3,89,78,83};
		int even=0;
		int odd=0;
		
		System.out.println("to check  even or odd");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		
		System.out.println("total numbers of even : "+even);
		System.out.println("total numbers of odd : "+odd);
	}

}
