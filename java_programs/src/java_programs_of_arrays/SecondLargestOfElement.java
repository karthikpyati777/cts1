package java_programs_of_arrays;

public class SecondLargestOfElement {

	 static int secondLargest(int[] a) {
		 int firstLargest,secondLargest;
		 
		 if(a[0]>a[1]) {
			 firstLargest=a[0];
			 secondLargest=a[1];
		 }
		 else {
			 
			 firstLargest=a[1];
			 secondLargest=a[0];
			 
		      }
	
		 for(int i=2;i<a.length;i++) {
			 
			 if(a[i]>firstLargest) {
				 secondLargest=firstLargest;
				 firstLargest=a[i];
			 }
			 else if(a[i]<firstLargest && a[i]>secondLargest) {
				 secondLargest=a[i];
			 }
		 }
	
		return secondLargest;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println(secondLargest(new int[] {1,4,5,6,7,3}));
	}

}
