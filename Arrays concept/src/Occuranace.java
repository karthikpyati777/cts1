
public class Occuranace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,5,6,3,1,4,5,1};
		int ele=1;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				System.out.println("the repetable elements are "+ count++ );
				
				
			}
			
		}

	}

}
