package com.revature.list;

public class MyArrayList {

	private int[] array = new int[5];
	private int size;
	
	public void add(int val) {
		// TODO Auto-generated method stub
		array[size] = val;
		size++;	
	}

	public void set(int index, int val) {
		// TODO Auto-generated method stub
		mylist.set(2, 10);
		mylist.set(4, 20);
	}

	public void remove(int index) {
		// TODO Auto-generated method stub
		array[size] = index;
		size--;
	}

	public int get(int index) {
		// TODO Auto-generated method stub
		mylist.get(index);
		return index;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println(mylist);
		return null;
	}
}
