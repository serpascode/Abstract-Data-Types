package test.type;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import type.implement.ArrayQueue;
import type.implement.ArrayStack;

public class TestStructure 
{
	@Test
	public void testStack(){
		ArrayStack stack = new ArrayStack(3);
		
		assertEquals("Size", 0, stack.size());
		assertEquals("Is Empty", true, stack.isEmpty());
		stack.push(1);
		assertEquals("Size", 1, stack.size());
		stack.push(2);
		assertEquals("Size", 2, stack.size());
		stack.push(3);
		assertEquals("Size", 3, stack.size());
		stack.push(4);
		assertEquals("Size", 3, stack.size());
		stack.push(4);
		assertEquals("Size", 3, stack.size());
		assertEquals("Pop", 3, stack.pop());
		assertEquals("Size", 2, stack.size());
		assertEquals("Not Empty", false, stack.isEmpty());
		assertEquals("Pop", 2, stack.pop());
		assertEquals("Pop", 1, stack.pop());
		assertEquals("Pop", -1, stack.pop());
		assertEquals("Size", 0, stack.size());
		assertEquals("Is Empty", true, stack.isEmpty());
	}
	
	@Test
	public void testQueue() {
		ArrayQueue queue = new ArrayQueue(5);
		
		assertEquals("Size", 0, queue.size());
		assertEquals("Is Empty", true, queue.isEmpty());
		queue.enqueue(9);
		assertEquals("Size", 1, queue.size());
		queue.enqueue(5);
		assertEquals("Size", 2, queue.size());
		queue.enqueue(7);
		assertEquals("Size", 3, queue.size());
		queue.enqueue(4);
		assertEquals("Size", 4, queue.size());
		assertEquals("Dequeue", 9, queue.dequeue());
//		assertEquals("Size", 2, queue.size());
//		assertEquals("Dequeue", 5, queue.dequeue());
//		assertEquals("Size", 1, queue.size());
//		queue.enqueue(4);
//		assertEquals("Size", 2, queue.size());
		
	}

}
