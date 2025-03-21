package ex03;

public class Ex03_T01 {

	public static void main(String[] args) {
		int ages = 65, money = 8000;
		if (ages >= 65 && money >= 10000 || ages >= 21 && money >= 25000) {
			System.out.println("資格符合");
		} else {
			System.out.println("資格不符合");
		}

	}
}
