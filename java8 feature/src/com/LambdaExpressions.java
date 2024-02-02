package com;


interface I
{
	void show(int i);
}

//class C implements I
//{
//
//	@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		System.out.println("hello");
//	}
//	
//}
public class LambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		I i=new C();
		I obj;
//		obj=new I()
//				{
//
//					@Override
//					public void show() {
//						// TODO Auto-generated method stub
//						System.out.println("hello");
//					}
//			    
//				};
		
		
		obj=i->System.out.println("hello" +i);
		
		
		obj.show(8);
		

	}

}
