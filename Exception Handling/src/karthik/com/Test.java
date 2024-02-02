package karthik.com;

import java.io.IOException;
import java.io.InvalidClassException;

public class Test {

	 public static void findFile() throws NullPointerException, IOException, InvalidClassException {
		    
		    // code that may produce NullPointerException
//		    … … … 

		    // code that may produce IOException
	//	    … … … 

		    // code that may produce InvalidClassException 
		   // … … … 
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try{
//		      findFile();
//		    } catch(IOException e1){
//		      System.out.println("io exception"+e1.getMessage());
////		    } catch(InvalidClassException e2){
////		      System.out.println(e2.getMessage());
////		    }
//
//	}
		for(int i=0;i<5;i++) {
			System.out.println(i+'');
		}
	}
}
