package karthik.com;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s=new String(" KARTHIK");
		System.out.println(s.length());
		System.out.println(s.indexOf("P"));
		System.out.println(s.replace('A', 'E'));
		System.out.println(s.charAt(2));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.compareTo(s));
		System.out.println(s.trim());
		String s1=s.concat(" HI ");
		System.out.println(s1);
	
	}

}
