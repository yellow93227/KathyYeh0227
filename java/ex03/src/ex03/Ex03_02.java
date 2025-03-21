package ex03;
public class Ex03_02 {
	public static void main(String[] args) {
		int max, n1=2, n2=3;
		if (n1 > n2) {        //使用if-else雙向條件式
			max = n1;
		} else {
			max = n2;
		}
		//使用條件運算子的寫法：
		max = (n1 > n2) ? n1 : n2;  //可以改用條件運算子來撰寫
		System.out.printf("%d , %d 兩數的最大值為 %d%n", n1, n2, max);
	}
}
