package ex05;

import java.util.Scanner;

public class Non_R_array2 {

	public static void main(String[] args) {
		String[][] data = new String[3][];
		Scanner scn = new Scanner(System.in);
		for(int x = 0; x < 3; x ++) {
			System.out.print(( x + 1) + "號同學接種幾劑疫苗：");
			data[x] = new String[scn.nextInt()];
			for(int y = 0; y < data[x].length; y ++) {
				System.out.print("請輸入第" + (y + 1) + "次接種日期：");
				data[x][y] = scn.next();
			}
		}
		scn.close();
		for(int x = 0; x < 3; x ++) {
			System.out.print((x + 1) + "號同學接種日期：");
			for(int y = 0; y < data[x].length; y ++)
				System.out.print(" " + data[x][y]);
			System.out.println();
		}
	}
}
