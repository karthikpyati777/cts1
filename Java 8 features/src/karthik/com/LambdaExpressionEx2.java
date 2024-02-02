package karthik.com;

public class LambdaExpressionEx2 {

	public static void main(String[] args) {
		HelloWorld helloWorld =  name ->
		{ 
			return "Hello " + name; 
		};
		 System.out.println(helloWorld.sayHello("karthik"));

	}

}
