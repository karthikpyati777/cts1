package arrays.com;

import java.util.Arrays;

public class Sortinasceanddesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {3,4,1,2,7,5};
		int temp;
		 Arrays.sort(a);
		 System.out.println("Asceding order element is : "+Arrays.toString(a));
		 
		 for(int i=0;i<a.length;i++) {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]<a[j]) {
					  temp=a[i];
				      a[i]=a[j];
				      a[j]=temp;
				 }
					 
			 }
		 }
		 for(int i=0;i<a.length;i++) {
			 System.out.print(a[i]+" ");
		 }

	}

}
