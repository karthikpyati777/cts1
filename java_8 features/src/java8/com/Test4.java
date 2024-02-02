package java8.com;
 interface intf4
 {
	 public double area(double r);
 }
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     intf4 k=r->3.14*r*r;
     System.out.println("area of circle is : " + k.area(2));
	}

}
