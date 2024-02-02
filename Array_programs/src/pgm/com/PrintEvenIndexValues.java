package pgm.com;

public class PrintEvenIndexValues {

 int a[]= {1,2,5,6,7,35};
 public void display()
 {
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]%2!=0)
		 {
			 System.out.println(a[i]);
		 }
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintEvenIndexValues p=new PrintEvenIndexValues();
		p.display();
	}

}
