package lambdaMyObject1;

import java.util.*; //使用Comparator必須引用此命名空間

//產品類別
class Product {
	private String name; // 品名
	private int price; // 單價
	private int qty; // 數量

	public Product(String _name, int _price, int _qty) {
		name = _name;
		price = _price;
		qty = _qty;
	}

	// getTotal()方法可取得單價*數量小計
	public int getTotal() {
		return (price * qty);
	}

	// 顯示產品銷售資訊
	public void show() {
		System.out.print(name + "\t" + price + "\t" + qty + "\t" + getTotal() + "\t");
	}
}

// ProductComparator類別實作Comparator介面的compare方法
// 用來比較Product產品銷售金額(單價*數量)
class ProductComparator implements Comparator<Product> {
	public int compare(Product o1, Product o2) {
		int a, b, r = 1;
		a = o1.getTotal();
		b = o2.getTotal();
		if (a > b) {
			r = 1;
		} else if (a == b) {
			r = 0;
		} else if (a < b) {
			r = -1;
		}
		return r;
	}
}

public class LambdaMyObject1 {
	public static void main(String[] args) {
		// 建立p[0]~p[3]的Product物件陣列
		Product[] p = new Product[] { new Product("火影忍者", 120, 77), new Product("航海王", 1000, 88),
				new Product("多啦A夢", 120, 99), new Product("鬼滅之刃", 560, 67) };
		// 使用Arrays的sort()方法進行由小到大排序p物件陣列
		// 排序規則為ProductComparator介面物件
		Arrays.sort(p, new ProductComparator());

		System.out.println("  品名 \t單價\t數量\t金額\t名次");
		System.out.println("===================================");
		// 以倒印方式印出p產品物件陣列資訊，以及產品銷售金額名次
		for (int i = p.length - 1, k = 1; i >= 0; i--, k++) {
			p[i].show();
			System.out.println(k);
		}
	}
}
