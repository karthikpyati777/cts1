
public class MinimumEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] a= {1,2,3,4,5};
         int min=a[0];
         for(int i=0;i<a.length;i++)
         {
        	 if(a[i]<min)
        	 {
        		 min=a[i];
        	 }
         }
         System.out.println("minimum element is : " +min );
	}

}
