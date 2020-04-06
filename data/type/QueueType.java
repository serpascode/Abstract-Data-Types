package data.type;

public interface QueueType 
{	
	public void enqueue(int value);
	
	public int dequeue();
	
	public int front();
	
	public int rear();
	
	public boolean isEmpty();
	
	public int size();
}
