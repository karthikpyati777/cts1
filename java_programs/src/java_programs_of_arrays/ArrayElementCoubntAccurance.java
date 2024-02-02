package java_programs_of_arrays;

public class ArrayElementCoubntAccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,1,3,2,1};
		int count =0;
		int element=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
				count++;
			}
		}
		System.out.println("1 number repetead for hoe many times : "+ count++);

	}

}
