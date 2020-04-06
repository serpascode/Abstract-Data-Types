package type.implement;

import data.type.QueueType;

public class ArrayQueue implements QueueType
{
	/*
	 * A queue accepts values at the end of the Queue
	 * and dequeues them from the front of the Queue
	 */
	
	int[] queue;
	int front;
	int rear;
	
	//Constructor Using Size as Input
	public ArrayQueue(int size){
		queue = new int[size];
		front = 0;
		rear = 0;
	}
	
	//The Modulus Arithmetic allows for a circular Queue
	@Override
	public void enqueue(int value) {
		if(size()<queue.length)
			queue[rear]=value;
		
		rear = (rear+1)%queue.length;
	}

	@Override
	public int dequeue() {
		
		return 0;
	}

	@Override
	public int front() {
		return front;
	}

	@Override
	public int rear() {
		return rear;
	}

	@Override
	public boolean isEmpty() {
		if(size()==0)
			return true;
		return false;
	}

	@Override
	public int size() {
		return (queue.length-front+rear)%queue.length;
	}

}
