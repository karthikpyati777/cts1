package karthik.com;

public class FunctionalInterfaceimpl implements AddInteger
{
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
	
		FunctionalInterfaceimpl f=new FunctionalInterfaceimpl();
		f.add(1, 2);
	}

}
