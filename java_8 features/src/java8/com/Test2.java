package java8.com;
 interface intf{
	 
	 public void sum(int a,int b);
	 
		 
	 
 }
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      intf x=(a,b)->System.out.println("the sum is:"+(a+b));
      x.sum(1, 2);
	}

}
