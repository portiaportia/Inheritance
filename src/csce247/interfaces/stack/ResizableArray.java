package csce247.interfaces.stack;

public class ResizableArray implements Stack {
	private String[] items;
	private int numItems;
	
	public ResizableArray() {
		items = new String[2];
	}
	
	private void resize() {
		String[] temp = new String[items.length * 2] ;
		System.arraycopy(items, 0, temp, 0, numItems);
		items = temp;
	}

	@Override
	public void push(String element) {
		if(items.length == numItems) {
			resize();
		}
		
		items[numItems] = element;
		numItems++;
	}

	@Override
	public String pop() {
		if(numItems == 0) return null;
		
		numItems--;
		String item =  items[numItems];
		items[numItems] = null;
		
		return item;
	}

}
