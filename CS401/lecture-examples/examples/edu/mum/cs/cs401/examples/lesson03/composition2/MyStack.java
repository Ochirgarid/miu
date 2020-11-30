package edu.mum.cs.cs401.examples.lesson03.composition2;

import java.util.LinkedList;

public class MyStack<T> {
	private LinkedList<T> list = new LinkedList<>();

	public T pop() {
		if (!list.isEmpty()) {
			return list.remove();
		} else {
			return null;
		}
	}

	public void push(T a) {
		list.addFirst(a);
	}
}
