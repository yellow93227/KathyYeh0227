/*
    �ڪ��Ĥ@��Java�{��                     
*/
package ex01;		//���wpackage ��ex01

import java.util.Scanner;	  //import Scanner���O�M��

/** �o�O�D���O Hi */
public class Hi {
	/**�o�O�{���i�J�I main ��k*/
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	/*�إ� Scanner ���� scn*/
		System.out.print("�п�J�m�W�G");
		String strName = scn.next();   //�r���ܼ�strName�x�sscn�������r��
		System.out.println("Hi! "+strName + ", �w��Ө�Java�@�ɡI");
		scn.close();	//����scn����
	}

}
