package ex03;

public class Ex03_T02 {
	static int countPrice(boolean isMem, int ages, boolean addMem) {
		int price;
		if (isMem) {
			if (ages > 65) {
				price = 0;
			} else {
				price = 70;
			}
		}
		else if (addMem) {
			price = 470;
		} else {
			price = 100;
		}
		return price;
	}

	public static void main(String[] args) {
		System.out.println(countPrice(true, 66, false));
		System.out.println(countPrice(true, 56, false));
		System.out.println(countPrice(false, 66, false));
		System.out.println(countPrice(false, 66, true));
	}

}
