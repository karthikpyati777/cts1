
public class Area {

	int length;
	int breadth;
	public Area(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	 public void getArea()
	 {
		 int area=length*breadth;
		 System.out.println("Area :"+area);
	 }
}
