package arrays.com;

public class MaxAndMinElementInTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {2,4,3,1,8,7,9};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) {

			if(a[i]>max)
				max=a[i];
		}
		System.out.println("The Maximum element in the array : "+max);
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("The Minimum number element in the array : "+min);

	}

}
