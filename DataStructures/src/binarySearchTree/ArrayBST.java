package binarySearchTree;

import java.lang.reflect.Array;

public class ArrayBST<E> {

	private E[] bst;
	private int numOfNodes;
	private Class<E> dataType;
	
	public ArrayBST(Class<E> dataType) {
		
		// if dataType does not implements the interface comparable it will throw an exception.
		if(!(Comparable.class.isAssignableFrom(dataType)))
			throw new RuntimeException("The data type must implements the interface 'comparable'!");
		
		// Erase it later. 
		System.out.println("The exception wasn't throw on the constructor!");
		
		numOfNodes = 0;
		this.dataType = dataType;
		
		@SuppressWarnings("unchecked")
		final E[] temp = (E[]) Array.newInstance(dataType, 9);
		bst = temp;
	}
	
	private void resize(int newSize) throws RuntimeException {
		
		if( newSize > bst.length)
			throw new RuntimeException("The new size must be longger");

		@SuppressWarnings("unchecked")
		final E[] newBST = (E[]) Array.newInstance(dataType, newSize);
		for(int i = 0; i < bst.length; i++) 
			newBST[i] = bst[i];
		bst = newBST;
	}
	
	public boolean isEmpty() {
		return numOfNodes == 0;
	}
}
