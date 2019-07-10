package csce247.interfaces.stack;

public class StackDriver {
	public static void main(String[] args) {
		
		System.out.println("Testing the Resizable Array");
		Stack stack = new ResizableArray();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("Testing the Linked List");
		Stack list = new ResizableArray();
		list.push("A");
		list.push("B");
		list.push("C");
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
	}
}
