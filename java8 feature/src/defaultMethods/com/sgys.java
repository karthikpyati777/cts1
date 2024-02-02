package defaultMethods.com;

import java.util.Arrays;

public class sgys {

	public static void main(String[] args) {
//		String s1="hello";
//		String s2 =new String("hello");
//		String s3="hello";
//		if(s1==s2)
//			System.out.println("s1 and s2 equal");
//		else
//			System.out.println("s1 and s2 not equal");
//		if(s1==s3)
//			System.out.println("s1 and s3 equal");
//		else
//			System.out.println("s1 and s3 not equal");
//		
//		//System.out.println(obj+""+obj2);
		
		int array[]=new int[5];
		for(int i=5;i>0;i--)
		
			array[5-i]=i;
			Arrays.fill(array,1,4,8);
			for(int i=0;i<5;i++)
				System.out.print(array[i]);
		
	}
}
