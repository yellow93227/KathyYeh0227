package ex03;

public class SwitchDemo3 {

	public static void main(String[] args) {
		//ㄒ1
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
		System.out.printf("%sへ扳基%dじ%n", size, price);
		
		//ㄒ2
		size = "L";
		switch (size) {
		case "S", "M" -> price = 500;
		case "L", "XL" -> price = 700;
		default -> price = 1000;
		}
		System.out.printf("%sへ扳基%dじ%n", size, price);
		
		//ㄒ3
		size = "XXL";
		price = switch (size) {
		case "S", "M" -> 500;
		case "L", "XL" -> 700;
		default -> 1000;
		};
		System.out.printf("%sへ扳基%dじ%n", size, price);
		
		//ㄒ4
		size = "M";
		price = switch (size) {
		case "S", "M" : yield 500;
		case "L", "XL" : yield 700;
		default : yield 1000;
		};
		System.out.printf("%sへ扳基%dじ%n", size, price);
		
		//ㄒ5
		size = "M";
		price = switch (size) {
		case "S", "M" -> {
			System.out.println("Mへヘ玡砯");
			yield 500;
		}
		case "L", "XL" -> 700;
		default -> 1000;
		};
		System.out.printf("%sへ扳基%dじ%n", size, price);
	}
}
