package ex02;

public class Ex02_T11 {

	public static void main(String[] args) {
		int x = 5, y = 10;
		int i = ++x * y--;
		System.out.println(i);
		int j = x-- + ++y;
		System.out.println(j);
	}

}
