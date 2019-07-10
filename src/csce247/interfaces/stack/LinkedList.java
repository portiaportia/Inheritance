package csce247.interfaces.stack;

public class LinkedList implements Stack{
	private Node first;
	
	@Override
	public void push(String element) {
		Node current = first;
		first = new Node();
		first.data = element;
		first.next = current;
	}

	@Override
	public String pop() {
		if(first == null)return null;
		
		String result = first.data;
		first = first.next;
		
		return result;
	}

}
