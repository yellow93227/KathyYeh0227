package ex05;

public class Ex05_T02 {

	public static void main(String[] args) {
		int[][] iArray ={{43,101,45}, {106,18,39}, {50,51,700}};
		for(int i = 0; i < iArray.length; i ++) 
		{
			for(int j = 0; j < iArray[i].length; j ++) 
			{
				if(iArray[i][j] > 100) break;
				System.out.printf("%d ", iArray[i][j]);
			}
		}
	}
}
