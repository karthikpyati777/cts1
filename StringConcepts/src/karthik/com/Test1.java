package karthik.com;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="karthik pyati";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') 
			count++;
		}
		System.out.println("total number of characters for given string is : " +count);
	}

}
