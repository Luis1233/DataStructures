package binaryTree;

import java.lang.reflect.Array;

/**
 * 
 *  Parent(r) = ⌊(r−1)/2⌋=⌊(r−1)/2⌋ if r≠0.
 *  Left child(r) = 2r+1 if 2r+1 ≤ n.
 *  Right child(r) = 2r+2 if 2r+2 ≤ n.
 *  Left sibling(r) =r−1 if r is even.
 *  Right sibling(r) = r+1 if r is odd and r+1 ≤ n.
 *
 * @author Luis Fernando Martinez.
 *
 * @param <T> - Data type of the tree.
 */
public class BinaryTreeArray<T> {
	
	private T[] tree;
	private int size;
	private Class<T> typeData;
	
	public BinaryTreeArray(Class<T> t) {
		size = 0;
		typeData = t;
		
		@SuppressWarnings("unchecked")
		final T[] tree = (T[]) Array.newInstance(t, 2);
		this.tree = tree;
	}
	
	/**
	 * Resize the array which contains the tree each time it is necessary. 
	 * @param size - size of the new array size.
	 */
	private void resize(int size) {
		if(tree.length < size) {
			@SuppressWarnings("unchecked")
			T[] newTree = (T[]) Array.newInstance(typeData, size);
			for(int i = 0; i < tree.length; i++)
				newTree[i] = tree[i];
			tree = newTree;
		} else {
			throw new RuntimeException("The size must be longest!");
		}
	}
	
	private boolean isFull() {
		return size == tree.length;
	}

}
