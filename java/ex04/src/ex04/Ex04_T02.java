package ex04;

public class Ex04_T02 {

	public static void countDown(int start) {
		for (int x = start; x >= 0; --x) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		countDown(10);
	}


}
