package queue;

import java.util.*;
class Food{
	int numOfSer;
	int calories;
	public Food(int numOfSer, int calories) {
		this.numOfSer = numOfSer;
		this.calories = calories;
	}
	}
class Node
{
	public Food food; 
	public Node Next ;
	public Node(Food food)
	{
		this.food = food;
	}
}
class Queue 
{
	private Node _head;
	private Node _tail;
	private int _count = 0;
	public Queue() { }
	public void Enqueue(Food myFood)
	{
		Node _newNode = new Node(myFood);
		if (_head == null)
		{
			_head = _newNode;
			_tail = _head;
		}
		else
		{
			_tail.Next = _newNode;
			_tail = _tail.Next;
		}
		_count++;
	}
	public Food Dequeue() throws Exception
	{
		if (_head == null)
		{
			throw new Exception("Queue is Empty");
		}
		Food _result = _head.food;
		_head = _head.Next;
		return _result;
	}
	public int Count()
	{
		 return this._count;
	}
}
class Test {
	public static void main(String[] args) {
		Queue queue = new Queue();
		Food newFood = new Food(3, 5);
		queue.Enqueue(newFood);
		System.out.println(queue.Count());
	}
}

