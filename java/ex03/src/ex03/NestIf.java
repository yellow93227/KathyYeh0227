package ex03;
import java.util.Scanner;
public class NestIf {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2, num3, max;
		System.out.print("�п�J�T�ӼƦr(�ťհϹj):");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();
		if (num1 > num2) {        // �α_���j��ӧP�_�T�ӼƦr���A�֬O�̤j�Ʀr
			if (num1 > num3)
				max = num1;
			else
				max = num3;
		} else {
			if (num2 > num3)
				max = num2;
			else
				max = num3;
		}
		System.out.println("�̤j���Ʀr�O:" + max);
		scn.close();
	}
}
