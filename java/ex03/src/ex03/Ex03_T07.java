package ex03;

public class Ex03_T07 {
	public static int pay(char grade) {
		int price = 0;
		switch (grade) {
			case 'A':
				price = 500;
				break;
			case 'B':
				price = 200;
			case 'C':
				price = 50;
				break;
			default:
				price = 1000;
				break;
		}
		return price;
	}

	public static void main(String[] args) {
		System.out.println(pay('A'));
		System.out.println(pay('B'));
		System.out.println(pay('C'));
		System.out.println(pay('D'));
	}

}
