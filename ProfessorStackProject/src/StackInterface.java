
public interface StackInterface<T> {
	
	public void push(T item) throws StackFullException;
	//places the item on the top of the stack
	
	public void pop() throws StackEmptyException;
	//removes the item on the top of the stack
	
	public T top() throws StackEmptyException;
	//returns the item on the top of stack
	
	public String toString2();
	//returns the items in the stack in the opposite order meaning 
	//that the items in the stack will be printed starting from the bottom until 
	//it gets to the top
	
	//newer professors will be closer to the top of the stack 
	//whereas older professors (in terms of years teaching) will be closer to the bottom of the stack

	
}
