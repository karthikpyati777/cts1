package karthik.com;

public class StringBufferExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s=new StringBuffer("welcome");
		System.out.println(s.append(" to cognizant"));
//		System.out.println(s.insert(0, "hi "));
//		System.out.println(s.delete(0, 2));
//		System.out.println(s.reverse());
		System.out.println(s.replace(0, 2, "hi "));
		System.out.println(s.length());
		System.out.println(s.substring(1));
		System.out.println(s.substring(3, 16));
		System.out.println(s.indexOf("i"));
		System.out.println(s.charAt(13));
		System.out.println(s.substring(2,5));
	

	}

}
