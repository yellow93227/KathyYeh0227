package ex04;

public class Ex04_T01 {
	static void showMenu() {
		System.out.println("目錄");
	}

	static boolean newTurn() {
		return false;
	}

	public static void main(String[] args) {
		showMenu();
		for (;;) {
			boolean b = newTurn();
			if (!b)
				break;
			showMenu();
		}
		
		do {
			showMenu();
		}while (newTurn());

	}

}
