package ex03;

public class SwitchDemo2 {

	public static void main(String[] args) {
		//例1
		int score=68;
		switch(score/10) {
		case 6,7,8,9,10 -> System.out.println("及格");   //多個case值可以寫在一起
		default -> System.out.println("不及格");
		}
		
		//例2
		char ch='Y';
		switch (ch) {
		case 'Y','y' -> System.out.printf("同意"); 
		default -> System.out.printf("不同意");
		}
		
		//例3
		int num=2;
		String numString = switch (num) {  
		case 1 -> "一";  
		case 2 -> "二";  
		case 3 -> "三";  
		case 4 -> "四";  
		default -> "錯誤";  
		};  
		System.out.printf ( num + " = " + numString);
		
		//例4
		char grade;
		switch (score / 10) {
		case 10,9,8 -> grade = '甲';
		case 7 -> grade = '乙';
		case 6 -> grade = '丙';	
		default -> grade = '丁'; 
		}
		System.out.println(score + "分是屬於" + grade + "級的成績。");
	}

}
