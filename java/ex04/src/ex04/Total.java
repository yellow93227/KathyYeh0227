package ex04;
import java.util.Scanner;
public class Total {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int price = 0;	// 輸入的單價預設為0
		int total = 0;	// 累計的總價預設為0
		while (price >= 0) {
			System.out.print("請輸入單價 (輸入 -1 結束):");
			price = scn.nextInt();	// 讀取單價
			if(price > 0) {
		    	total += price;		// 將單價加到總價total中
			}
		}
		System.out.printf("總價 = %d 元",total);
		scn.close();
	}
}
