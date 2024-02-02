package karthik.com;

public class Implementation implements SubInteger {
	 public void sub(int a,int b)
	 {
		 System.out.println(a-b);
	 }
	 
	 

	 public static void main(String[] args) {
			
		 Implementation i=new Implementation();
			i.sub(5,3);
		}

}
