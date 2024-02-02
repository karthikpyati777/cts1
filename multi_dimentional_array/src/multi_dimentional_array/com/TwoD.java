package multi_dimentional_array.com;

public class TwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a={{1,2,3},
				{4,5,6,7},
        {8,9}};
//		System.out.println(a[0].length);
//		System.out.println(a[1].length);
//		System.out.println(a[2].length);
		
//		for(int i=0;i<a.length;i++) {
////			System.out.println("rows are :"+a.length);
//			for(int j=0;j<a[i].length;++j) {
//				System.out.println(a[i][j]);
//			}
//		}
		
		//forEach...loop
		for(int[] b:a) {
			for(int ele:b) {
				System.out.println(ele);
			}
		}
		
		
	}

}
