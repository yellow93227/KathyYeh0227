package test10_4;

public class Test10_4 {
	public static void main(String[] args) {
		try {
			int x = 0;
			int y = 20;
			int z = y / x;
			int arr[] = {5};
			arr[5] = 50;
			System.out.println("運算結果：" + z);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}catch (RuntimeException e) {
			System.out.println(e);
		}
	}
}
