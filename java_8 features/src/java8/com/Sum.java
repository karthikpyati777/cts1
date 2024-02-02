package java8.com;

interface add{
	void sum(int a,int b);
}
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     add x=(a,b)->System.out.println("the sum is :"+(a+b));
     x.sum(1, 2);
	}

}
