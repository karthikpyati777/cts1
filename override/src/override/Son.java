package override;

public class Son extends Parent {

public void bike() {
	super.bike();
	System.out.println("bike is ready");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Son s=new Son();
        s.bike();
	}

}
