package ex03;

public class SwitchDemo3 {

	public static void main(String[] args) {
		//��1
		String size = "S";
		int price = 0;
		switch (size) {
		case "S":
		case "M":
			price = 500;
			break;
		case "L":
		case "XL":
			price = 700;
			break;
		default:
			price = 1000;
		}
		System.out.printf("%s�ؤo���%d��%n", size, price);
		
		//��2
		size = "L";
		switch (size) {
		case "S", "M" -> price = 500;
		case "L", "XL" -> price = 700;
		default -> price = 1000;
		}
		System.out.printf("%s�ؤo���%d��%n", size, price);
		
		//��3
		size = "XXL";
		price = switch (size) {
		case "S", "M" -> 500;
		case "L", "XL" -> 700;
		default -> 1000;
		};
		System.out.printf("%s�ؤo���%d��%n", size, price);
		
		//��4
		size = "M";
		price = switch (size) {
		case "S", "M" : yield 500;
		case "L", "XL" : yield 700;
		default : yield 1000;
		};
		System.out.printf("%s�ؤo���%d��%n", size, price);
		
		//��5
		size = "M";
		price = switch (size) {
		case "S", "M" -> {
			System.out.println("M�ؤo�ثe�ʳf");
			yield 500;
		}
		case "L", "XL" -> 700;
		default -> 1000;
		};
		System.out.printf("%s�ؤo���%d��%n", size, price);
	}
}
