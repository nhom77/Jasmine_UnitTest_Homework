import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	String[] data = {"A", "B"};
	private IStack stack = new Stack();

	@Test
	void testStackPush() throws StackEmptyException {
		for (int i = 0; i < data.length; i ++) {
			stack.push(data[i]);
		}
		assertEquals(0, stack.getTop());
	}

	@Test
	void testStackPeek() throws StackEmptyException {
		for (int i = 0; i < data.length; i ++) {
			stack.push(data[i]);
		}
		assertEquals("B", stack.peek());
	}

	@Test
	void testStackContains() throws StackEmptyException {
		for (int i = 0; i < data.length; i ++) {
			stack.push(data[i]);
		}
		assertEquals(true, stack.contains("A"));
	}

	@Test
	void testStackPop() throws StackEmptyException {
		for (int i = 0; i < data.length; i ++) {
			stack.push(data[i]);
		}
		assertEquals("A", stack.pop());
	}

	@Test
	void testStackEmpty() throws StackEmptyException {
		for (int i = 0; i < data.length; i ++) {
			stack.push(data[i]);
		}
		assertEquals(false, stack.isEmpty());
	}

}
