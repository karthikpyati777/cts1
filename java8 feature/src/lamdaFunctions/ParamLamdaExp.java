package lamdaFunctions;

interface see{
	void show();
}
public class ParamLamdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       see s=()->System.out.println("hi karthik");
       s.show();
	}

}
