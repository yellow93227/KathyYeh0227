package ex04;

public class Ex04_T04 {
	
	public static void function1() {
		int a = 1, b = 1;
		for (int i = 1; i < 10; i++) {
			a += i;
		}
		for (int i = 1; i < 10; i++) {
			b += i;
		}
		System.out.println("a=" + a + ",b=" + b);
	}

	public static void function2() {
		int i = 1, sum = 0;
		// for (int i = 0; i < 10; i++) {
		for (i = 0; i < 10; i++) {
			sum += i;
		}
		System.out.println("sum=" + sum);
	}

	public static void main(String[] args) {
		function1();
		function2();
	}

}
