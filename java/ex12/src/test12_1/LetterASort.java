package test12_1;
import java.util.*;

public class LetterASort {
	public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("aAaA");
	    strings.add("AaA");
	    strings.add("aAa");
	    strings.add("AAaa");
	    Collections.sort(strings);
	    for (String s : strings) { System.out.print(s + ""); }
	}
}