package ex05;

public class Ex05_T05 {

	public static void main(String[] args) {
		char[][] cArray = { {'1','2','3'}, {'4','5','6'}, {'7','8', '9'}};

		for(int x = 0; x < cArray.length; x++) {
			for(int y = cArray[x].length - 1; y >= 0; y--)
				System.out.print(cArray[x][y]);
		}
	}
}
