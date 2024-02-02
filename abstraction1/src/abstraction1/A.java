package abstraction1;

abstract class B{
//	 B(){
//			 
//	 };
	 
	 abstract void run(); 
		 
	 public void doGearChange() {
		 System.out.println("Gear the Change");
	 }
}

public class A  extends B{

	@Override
	void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Mhananda is ruuning on the road");
		
	}
	public static void main(String[] args) {
		
		B b=new A();
		b.run();
		b.doGearChange();
		
	}

}
