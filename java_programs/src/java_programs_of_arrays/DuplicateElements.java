package java_programs_of_arrays;

public class DuplicateElements {
	
	
	public static void main(String[] args) {
		
		int []a= {4,1,3,5,7,6,7,2,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
					System.out.println("duplicate elements are : "+a[j]);
			}
		}
		
		
	}

}
