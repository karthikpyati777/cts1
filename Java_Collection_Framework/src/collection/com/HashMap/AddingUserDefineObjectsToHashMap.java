package collection.com.HashMap;

import java.util.HashMap;
import java.util.Map;

public class AddingUserDefineObjectsToHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, Student> m=new HashMap<>();
		m.put(1,new Student("karthik","pyati"));
		m.put(2,new Student("shilpa","pyati"));
		m.put(3,new Student("dinesh","pyati"));
		System.out.println(m.values());
	}

}
