package ex04;
import java.util.Scanner;
public class NestWhile {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String msg = "座號\t計概\t程設\t總分\n";
		String score = "";        // 輸入的分數
		int sum = 0; int no = 1; int sub = 0;    // 總分、 座號、 科目
		while (no > 0) {
			System.out.print("請輸入座號:");
			no = Integer.parseInt(scn.nextLine());  // 讀取座號
			if (no > 0) {msg += no + "號\t";}			
			sum = 0; sub = 0; 	        // 設總分、科目為0
			while (no > 0 && ++sub <= 2) {
				System.out.printf("請輸入%d號%s分數:",no,(sub==1 ?"計概":"程設"));
				score = scn.nextLine();  // 讀取分數
				msg += score + "\t";     // 將分數加入msg字串
				sum += Integer.parseInt(score);  // 將分數轉成整數後加入sum
			}
			if (no > 0) {msg += sum + "\n";}     // msg字串加入換行符號
		}
		System.out.println(msg);     // 顯示msg字串
		scn.close();
	}
}
