package basicsofjava.com;

public class Test1 {

	public void say() {
		System.out.println("Hi");
	}
	public String say(String saySomthing) {
		return "Hello";
	}
	public int say(int a) {
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Test1 t=new Test1();
		 t.say();
		System.out.println(t.say(2)); 
		 System.out.println(t.say("karthik"));

	}

}
