package basicsofjava.com;

interface i1 {
		void m1();
		
}
public class T1 implements i1{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        i1 a=new T1();

        a.m1();
       
		 
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hockey");
	}

}
