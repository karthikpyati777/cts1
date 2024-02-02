package lamdaFunctions;

interface Show{
	double disp(double r);
}
public class Hi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Show s=(r)->3.14*r*r;
       System.out.println("the area of circle is : "+s.disp(2));
       
	}

}
