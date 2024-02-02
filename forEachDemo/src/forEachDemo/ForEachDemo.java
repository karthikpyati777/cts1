package forEachDemo;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Integer> values=Arrays.asList(1,2,3,4,5);
   
     // System.out.println( values.get(1));
   
   //external forloop
      //enhance for loop
   
//      for(int i:values)
//      {
//    	  System.out.println(i);
//      }
      
      
      //normal forloop
      
      // external forloop
//      for(int i=0;i<=values.size();i++)
//      {
//    	  System.out.println(i);
//      }
//      
      
    	//internal forloop
      
      values.forEach(i->System.out.println(i));
	}

}
