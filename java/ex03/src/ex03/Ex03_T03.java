package ex03;

public class Ex03_T03 {
	public static void main(String[] args) {
		//1.
		int ages = 20;
		double off = 0.0;
		if (ages >= 25) {
			off = 0.50;
		} else if (ages >= 21) {
			off = 0.25;
		} else {
			off = 0.0;
		}
		System.out.println(off);
		//2.
		String level = "乙", msg = "";
		if (level == "甲") {
			msg = "表現超群";
		} else if (level == "乙") {
			msg = "表現正常";
		} else {
			msg = "再接再厲";
		}
		System.out.println(msg);
		//3.
		double grade = 3.5;
		int series = 0;
		if (grade == 4.0) {
			series = 1;
		} else if (grade >= 3.0) {
			series = 2;
		} else if (grade >= 2.5) {
			series = 3;
		}
		System.out.println(series);
	}
}
