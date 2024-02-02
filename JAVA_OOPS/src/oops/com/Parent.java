
package oops.com;

public class Parent extends GrandParent {

 int a=7;
 public void display() {
	 System.out.println("MS DHONI");
	 
 }
		
 public static void main(String[] args) {
	 
	 Parent p=new Parent();
	 System.out.println(p.x);
	 System.out.println(p.a);
	 p.say();
	 p.display();
}
 
}
