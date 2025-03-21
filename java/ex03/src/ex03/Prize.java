package ex03;
import java.util.Scanner;
public class Prize {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入學期成績: ");
		int score = scn.nextInt();
		if (score <= 100 && score >= 0) {
			//int prize = 0;
			//switch (score / 10) {
			//case 9, 10 -> prize = 500;
			//case 8 -> prize = 200;
			//default -> prize = 0;
			//}
			int prize = switch (score / 10) {
			case 9, 10 -> prize = 500;
			case 8 -> prize = 200;
			default -> prize = 0;
			};			
			System.out.println(score + " 分獎學金 " + prize + " 元");
		} else {
			System.out.println(score + " 分數超出範圍！");
		}
		scn.close();
	}
}
