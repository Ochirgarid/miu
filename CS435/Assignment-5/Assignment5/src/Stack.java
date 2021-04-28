import java.util.ArrayList;
import java.util.List;

public class Stack {
	List<Node> myStack;

	Stack() {
		myStack = new ArrayList<Node>();
	}

	class Node {
		int val;
		int min;

		Node(int pVal, int pMin) {
			val = pVal;
			min = pMin;
		}
	}

	public int peek() {
		if (isEmpty())
			throw new IndexOutOfBoundsException();

		return myStack.get(myStack.size() - 1).val;
	}

	public int min() {
		if (isEmpty())
			throw new IndexOutOfBoundsException();
		return myStack.get(myStack.size() - 1).min;
	}

	public void push(int pVal) {
		int minimum;
		if (isEmpty()) {
			minimum = pVal;
		} else {
			if (min() > pVal) {
				minimum = pVal;
			} else {
				minimum = min();
			}
		}
		Node n = new Node(pVal, minimum);
		myStack.add(n);
	}

	public int pop() {
		if (isEmpty())
			throw new IndexOutOfBoundsException();

		int result = peek();
		myStack.remove(myStack.size() - 1);
		return result;
	}

	public boolean isEmpty() {
		return myStack.size() == 0;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (Node n : myStack) {
			sb.append("val = " + n.val + " min = " + n.min + "\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(3);
		st.push(5);
		st.push(1);
		st.push(4);
		st.push(5);

		System.out.print("Stack: " + st.toString());
		
		st.pop();
		st.pop();
		st.pop();
	}
}
