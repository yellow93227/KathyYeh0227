package ex03;
public class Ex03_04 {
	public static void main(String[] args) {
		int num1=2, num2=5, num3=4, max;
		if (num1 > num2) {
			if (num1 > num3)
				max = num1;
			else
				max = num3;
		} else {
			if (num2 > num3)
				max = num2;
			else
				max = num3;
		}
		System.out.printf("%d , %d , %d 三數的最大值為 %d%n", num1, num2, num3, max);
	}
}
