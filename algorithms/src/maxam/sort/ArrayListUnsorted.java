package maxam.sort;

import java.util.ArrayList;

public class ArrayListUnsorted<T> extends ArrayList<T> {
	
	private static final long serialVersionUID = 1L;

	public ArrayListUnsorted() {
		super();
	}
	
	public ArrayListUnsorted<T> addItem(T value) {
		this.add(value);
		return this;
	}
	
	public ArrayListUnsorted<T> a(T value) {
		return addItem(value);
	}
}
