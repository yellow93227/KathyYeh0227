public class Bubblesort {
    public static void main(String[] args) {
		int[] aNum = { 8, 3, 5, 4, 9,2 };
		System.out.print(" 排  序  前：\t");
		for (int a = 0; a < aNum.length; a++)
			System.out.print(" " + aNum[a] + "\t");
		System.out.println();
		int n = aNum.length;
		int t;
		for (int i = n - 2; i >= 0; i--) { // 進行氣泡排序法
			for (int j = 0; j <= i; j++) {
				if (aNum[j] > aNum[j + 1]) {
					t = aNum[j];
					aNum[j] = aNum[j + 1];
					aNum[j + 1] = t;
				}
			}
			System.out.print(" 第 " + (5 - i) + " 次循環：\t");
			for (int a = 0; a < aNum.length; a++)
				System.out.print(" " + aNum[a] + "\t");
			System.out.println();
		}
		System.out.print(" 排  序  後：\t");
		for (int a = 0; a < aNum.length; a++)
			System.out.print(" " + aNum[a] + "\t");
	}
    
}
