package ex06;

public class Ex06_T06 {
	public static int method1(int start) {
		int sum = 0;
		for(int i = start; i >= 0; i --) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(method1(10));
	}

}
