package test12_5;
import java.util.*;

public class Test12_5 {
	public static void main(String[] args) {
		ArrayList<Integer> stack = new ArrayList<>();
    	stack.add(23);
        stack.add(67);
        stack.add(41);
        stack.add(99);
        stack.add(54);
        System.out.println("Initial Stack: " + stack); 
        pop(stack);
        System.out.println("after pop: " + stack); 
        push(stack, 100);
        System.out.println("after push: " + stack);
	}

	public static Integer pop(ArrayList<Integer> stack) {
		int index = stack.size()-1;
		return stack.remove(index);
	}
	
	public static void push(ArrayList<Integer> stack, Integer item) {
		int index = stack.size();
		stack.add(index, item);
	}
	
}
