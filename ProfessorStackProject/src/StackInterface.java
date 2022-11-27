
public interface StackInterface<T> {
	
	public void push(T item) throws StackFullException;
	
	public void pop() throws StackEmptyException;
	
	public T top() throws StackEmptyException;
	
	public String toString2();
	//returns the items in the stack in the opposite order meaning 
	//that the items in the stack will be printed starting from the bottom until it gets to the top
	
	public void push(T item1, T item2) throws StackFullException;
	//additional method - allows user to push two items to the stack
	
	public void doublePop() throws StackEmptyException;
	//additional method - allows user to pop two items from the stack 
	
	
	
}
