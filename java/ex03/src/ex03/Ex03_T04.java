package ex03;

public class Ex03_T04 {

	static int calPrize(double gpa, int sat, int act) {
		int prize = 0;
		if (gpa >= 3.8 && (sat >= 1200 || act >= 25)) {
			prize = 3000;
		} else if (gpa >= 3.0 || sat >= 1200 || act >= 26) {
			prize = 1500;
		}
		return prize;
	}

	public static void main(String[] args) {
		System.out.println(calPrize(3.4, 1100, 27));
		System.out.println(calPrize(2.6, 1400, 28));
		System.out.println(calPrize(3.8, 1300, 22));
	}

}
