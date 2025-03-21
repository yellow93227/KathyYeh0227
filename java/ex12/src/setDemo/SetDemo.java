package setDemo;
import java.util.*;

public class SetDemo {
	public static void main(String[] args) {
	    var hset = new HashSet<>();
		//HashSet<String> hset = new HashSet<>();
		//Set<String> hset = new HashSet<>();
		hset.add("杜穆濟");              //將字串常值資料存入集合物件中
		//字串集合
		var babil = Set.of("伊南娜", "尼努爾塔", "杜穆濟", "納姆塔爾"); 
		//字串陣列
		//String[] babil = {"伊南娜", "尼努爾塔", "杜穆濟", "納姆塔爾"}; 
		for (String p : babil)     //將字串集合元素資料存入集合物件中
		    hset.add(p);
		String myBabil = "阿特拉哈西斯";
		hset.add(myBabil);              //將字串變數資料存入集合物件中
		System.out.println("巴比倫神：" + hset);  //顯示集合中的所有元素內容
	}
}
