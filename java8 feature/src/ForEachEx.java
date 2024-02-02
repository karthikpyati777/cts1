import java.util.Arrays;
import java.util.List;

public class ForEachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=Arrays.asList(1,2,3,4,5);
		
//		
//		for(int i=0;i<l.size();i++)
//		{
//			System.out.println(l.get(i));
//		}
		
		
//		for(int i:l)
//		{
//			System.out.println(i);
//		}
		
		l.forEach(i->System.out.println(i));

	}

}
