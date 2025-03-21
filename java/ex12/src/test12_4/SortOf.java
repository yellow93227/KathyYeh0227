package test12_4;
import java.util.*;

public class SortOf {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);  a.add(5);  a.add(3);
        Collections.sort(a);
        a.add(2);
        Collections.reverse(a);
        System.out.println(a);
    }
}