package basicsofjava.com;

public class Cons {

	int age;
	Cons(int a){
		age=a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Cons c=new Cons(18);
		Cons s=new Cons(21);
		System.out.println(c.age+" "+s.age);
	}

}
