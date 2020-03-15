
public class Stack implements IStack  {
	
	private final int ARRAY_SIZE = 10;
    private String[] data = new String[ARRAY_SIZE]; 
    private int top = -1;
	
	public Stack() {
	}
	
	@Override
	public int getTop() {
		return top;
	}
	
	@Override
	public void clear() throws StackEmptyException {		
		if (top == -1) {
			throw new StackEmptyException("CLEAR ERROR: Stack is empty");
        }
		for (int i = top; i >= 0; i --) {
			pop();
		}
		
	}

	@Override
	public boolean contains(String value) throws StackEmptyException {
		if (top == -1) {
			throw new StackEmptyException("CONTAINS ERROR: Stack is empty");
        }
		for (int i = 0; i < data.length; i ++) {
			if (data[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String peek() throws StackEmptyException {
		if (top == -1) {
			throw new StackEmptyException("PEEK ERROR: Stack is empty");
        }
		return data[top];
	}

	@Override
	public void push(String value) throws StackEmptyException {
		if (top >= ARRAY_SIZE)
			throw new StackEmptyException("PUSH ERROR: data is full");

        top++;
        data[top] = value;
	}

	@Override
	public String pop() throws StackEmptyException {
		if (top == -1) {
			throw new StackEmptyException("POP ERROR: Stack is empty");
        }
		data[top] = null;
		top--;
		return data[top];
	}

	@Override
	public boolean isEmpty() {
		return top == -1;
	}

}
