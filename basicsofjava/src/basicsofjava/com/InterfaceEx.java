package basicsofjava.com;

interface i{
	void say();

	
}
interface j extends i{
	void show();
}

public class InterfaceEx implements i,j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        i see=new InterfaceEx();
        j s=new InterfaceEx();
        see.say();
        s.show();
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("hello vaagmi");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hello Karthik");
	}

}
