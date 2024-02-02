package karthik.com;

public class countingVowelsAndConsonents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="welcome to karnataka";
		s= s.toLowerCase();
		int vCount=0,cCount=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vCount++;
			}
			else if (s.charAt(i) >= 'a' && s.charAt(i)<='z') {
				cCount++;
			}
		}
		System.out.println("vowel count :"+vCount);
		System.out.println("consonant count "+cCount);
	}

}
