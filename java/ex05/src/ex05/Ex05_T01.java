package ex05;

public class Ex05_T01 {

	public static void main(String[] args) {
	    int[][] Array2= { {1,2,3,4},{5,6,7,8} };
	    for(int x= 0; x < Array2.length; x++)
	    	for(int y = 0; y < Array2[x].length; y++)
	    		System.out.println(Array2[x][y]);
	}

}
