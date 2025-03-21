package ex03;
public class SwitchDemo1 {
	public static void main(String[] args) {
		int num=2;
		switch (num) {	// 變數
		case 1: 
			System.out.printf("一月");
			break;
		case 2:
			System.out.printf("二月");
			break;
		default: 
			System.out.print("不是一月或二月"); 
		}
		int num1=1,num2=2;
		switch (num1 + num2) {	// 運算式
		case 1: 
		case 2:
		case 3:
			System.out.printf("兩數相加的值介於1~33");
			break;
		default: 
			System.out.print("兩數相加的值不是介於1~33");
		}
		char ch='y';
		switch (ch) {	// 字元變數
		case 'Y': 
		case 'y': 
			System.out.printf("繼續使用！");
			break;
		default: 
			System.out.printf("離開系統！"); 
		}
		String title="主任";
		switch (title) {	// 字串變數
		case "董事長": 
			System.out.printf("公司的領導！");
			break;
		case "經理": 
			System.out.printf("公司的中堅！");
			break;
		default: 
			System.out.printf("公司的基礎！"); 
		}


	}

}
