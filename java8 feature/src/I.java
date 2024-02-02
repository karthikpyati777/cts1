
 interface I {

	 
	void eat();
	static void m()
	{
		System.out.println("hi");
	}
	
	static void s()
	{
		System.out.println("hello");
	}
	
	class e implements I
	{

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			System.out.println("karthik");
		}
		
	}
	public static void main(String[] args)
	{
		I.m();
		I.s();
		
		I i=new e();
		i.eat();
		
	}
}
