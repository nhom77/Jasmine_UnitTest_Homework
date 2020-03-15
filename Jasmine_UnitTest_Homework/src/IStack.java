
public interface IStack {

	int getTop();
	void clear() throws StackEmptyException;
	boolean contains(String value) throws StackEmptyException;
	String peek() throws StackEmptyException;
	void push(String value) throws StackEmptyException;
	String pop() throws StackEmptyException;
	boolean isEmpty();
}
