package test12_3;
import java.util.*;

public class Mapit {
	public static void main(String[] args) {
	    Set<Integer> set = new HashSet<>();
	    int i1 = 45, i2 = 46;
	    set.add(i1);
	    set.add(i1);
	    set.add(i2);
	    System.out.print(set.size() + " ");
	    set.remove(i1);
	    System.out.print(set.size() + " ");
	    i2 = 47;
	    set.remove(i2);
	    System.out.print(set.size() + " ");
	}
}
