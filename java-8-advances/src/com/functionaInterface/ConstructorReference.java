package com.functionaInterface;

@FunctionalInterface
interface Messagable{
	Message sendSomeMessage(String msg);
}
class Message{
	Message(String msg){
		System.out.println(msg);
	}
}
public class ConstructorReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Messagable m=Message::new;
		 m.sendSomeMessage("hello");
		
	}

}
