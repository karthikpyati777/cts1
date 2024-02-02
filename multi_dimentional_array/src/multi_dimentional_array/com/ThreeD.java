package multi_dimentional_array.com;

public class ThreeD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][][] a= {
				{
					{1,-2,3},
					{4,6,1}
				},
				{
					{-4,-5,6,1},
					{
						2,6
					},
					{
						1
					}
				}
		};
		for(int[][] x:a) {
			for(int[] y:x) {
				for(int z:y) {
					System.out.print(z+" ");
				}
			}
		}
	}

}
