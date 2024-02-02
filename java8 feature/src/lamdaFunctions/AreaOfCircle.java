package lamdaFunctions;

interface Area{
	double area(double r );
	
	
}

public class AreaOfCircle implements Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Area a=new AreaOfCircle();
       System.out.println("the vale of Area Of Citcle is : "+ a.area(2));
	}

	@Override
	public double area(double r) {
		// TODO Auto-generated method stub
		return 3.14*r*r;
		
	}

}
