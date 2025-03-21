package ex04;

public class Ex04_T03 {

	public static void main(String[] args) {
		int i = 0, j = 0;
		Block1: {
			for (i = 1; i <= 10; i++) {
				for (j = 1; j <= 10; j++) {
					if (i == 3 && j == 8)
						break Block1;
					System.out.print(i);
				}
				System.out.println();
			}
		}
		System.out.println();
		
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 10; j++) {
				System.out.print(i);
			}
			if (i == 3)
				break;
			System.out.println();
		}
		System.out.println();
		
		for (i = 2; i <= 4; i++) {
			for (j = 1; j <= 10; j++) {
				if (j % i==0)
					continue;				
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
