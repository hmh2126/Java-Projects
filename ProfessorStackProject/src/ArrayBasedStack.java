public class ArrayBasedStack<T> implements StackInterface<T> {

	//instance variables
	private int top;
	private T[] stack;

//default constructor
	public ArrayBasedStack() {
		top = -1;
		stack = (T[]) new Object[50];			//default size 
	}

//overloaded constructor
	public ArrayBasedStack(int sizeOfStack) {
		top = -1;
		stack = (T[]) new Object[sizeOfStack];
	}

	@Override
	public void push(T item) throws StackFullException {
		if(top < stack.length-1) {
			top++;
			stack[top] = item;
		}
		else
			throw new StackFullException("Push cannot be done on a full Stack!");
	}

	
	@Override
	public void pop() throws StackEmptyException {
		if(top > -1) {
			stack[top] = null;
			top--;
		}
		else 
			throw new StackEmptyException("Pop cannot be done on an empty Stack!");
	}

	@Override
	public T top() throws StackEmptyException {
		if(top > -1)
			return stack[top];
		else
			throw new StackEmptyException("Top cannot be attempted on an empty Stack!");
	}

	public String toString() {										//regular print out of items in stack
		String totItems = "";
		for (int index = top; index > -1; index--) {
			totItems = totItems + "\n" + stack[index].toString();
		}
		return totItems;

	}

	@Override
	public String toString2() {										//backwards print out of items in stack
		String totItems = "";
		for (int index = 0; index <= top; index++) {
			totItems = totItems + "\n" + stack[index].toString();
		}
		return totItems;
	}
}
