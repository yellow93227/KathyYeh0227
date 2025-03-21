package test10_2;

public class Test10_2 {

	static int[] a;
	static {
		a[0] = 2;
	}

	public static void main(String[] args) {
		try {
			int num = a[0]++ / 3;
			int result = a[0] / num;
			System.out.println("運算結果：" + result);
		}catch(Exception e) {
			if(e instanceof ArithmeticException) {
				System.out .println("例外名稱：" + e.getClass().getCanonicalName());
    		} else {
         		System.out.println("例外名稱：" + e.getClass().getCanonicalName());
    		}
		}
	}

}
