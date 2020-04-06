package type.implement;

import data.type.StackType;

public class ArrayStack implements StackType
{
	/*
	 * A stack is a First In Last out.
	 */
	
	int[] stack;
	int top;
	
	public ArrayStack(int size){
			this.stack = new int[size];
			this.top = -1;
	}
	
	@Override
	public void push(int input) {
		if(top+1<this.stack.length){
			top++;
			stack[top] = input;
		}
	}

	@Override
	public int pop() {
		if(top>=0){
			int temp = stack[top];
			stack[top--]=-1;
			return temp;
		}
		return top;
	}

	@Override
	public int top() {
		if(!isEmpty())
			return stack[top];
		return top;
	}

	@Override
	public int size() {
		return top+1;
	}

	@Override
	public boolean isEmpty() {
		if(top>=0)
			return false;
		return true;
	}

}
