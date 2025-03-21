package ex04;

public class Ex04_T05 {

	public static void addOne(int num) {
		num++;
	}

	public static void main(String[] args) {
		int num = 55;
		for (int nt = 0; nt < 10; nt++) {
			addOne(num);
			if (nt==9) {
				System.out.printf("nt=%d時num=%d%n",nt,num);
			}
		}
		System.out.println(num);
	}

}
