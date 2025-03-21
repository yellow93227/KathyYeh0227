package ex02;
public class Ex02_T04 {
	public static void main(String[] args) {
		int i1 = 5, i2 = 31;
		double d = 3.5;
		float f = 0.5f;
		short s = 20;
		i1 += 8 % 2 + s;
		i2 %= s * 2 + 1;		
		d /= 5 * 4;
		f *= 3 + 5 % 9;
		System.out.printf("i1 變數值為 %d%n",i1);
		System.out.printf("i2 變數值為 %d%n",i2);
		System.out.printf("d 變數值為 %f%n",d);
		System.out.printf("f 變數值為 %f%n",f);;
	}

}
