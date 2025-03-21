package ex04;

public class Ex04_T06 {

	public static void main(String[] args) {
		int times = 60;
		while (times >= 0) {
			if (times == 0)
				break;
			else {
				System.out.println("倒數中...");
				times--;
			}
		}
		System.out.println("倒數中結束！");
	}

}
