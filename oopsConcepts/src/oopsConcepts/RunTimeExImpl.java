package oopsConcepts;

public class RunTimeExImpl extends RunTimeEx {
	
	public void bike() {
		super.bike();
		System.out.println("fathers bike modified by son");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RunTimeExImpl r=new  RunTimeExImpl();
		 r.bike();
		

	}

}
