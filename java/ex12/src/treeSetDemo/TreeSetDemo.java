package treeSetDemo;
import java.util.*;

public class TreeSetDemo {
	public static void main(String[] args) {
		var tset = new TreeSet<>();
		//TreeSet<String> tset = new TreeSet<>();
		String[] character = {"box", "dog", "help", "time", "ox", "map",
				              "apple", "flag", "cat", "banano"};
		for (String s : character)
		    tset.add(s);
		System.out.println("物件內元素的內容：");
		System.out.println("  " + tset);
		System.out.println("第一個元素內容為：" + tset.first());
		System.out.println("最後一個元素內容：" + tset.last());
		Scanner keyin = new Scanner(System.in);
		 
		String st1;
		while (true) {
			System.out.print("\n請輸入其中一個英文單字？ ");
			st1 = keyin.nextLine();
		    if(tset.contains(st1)) 
		    	break;
	    	System.out.println("  " + st1 +" 單字不在集合物件中");	
	    }
		System.out.print("  從 " + st1 + " 單字開始排列的元素內容：");
		System.out.println(tset.tailSet(st1));
	    keyin.close();
	}	
}