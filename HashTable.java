package com.bridgelabzhash;

public class HashTable<E, K> 
{
	
	Node<E, K> head = null, current, temp;

	@SuppressWarnings("hiding")
	class Node<E, K> 
	{
		E key;
		K data;
		Node<E, K> next;

		Node(E k, K value) 
		{
			key = k;
			data = value;
			next = null;
		}
	}
	
	
	/**
	 * This method is used to insert the data
	 * 
	 * @param data This is the value of the data
	 */
	public void insertNode(E keys, K data) 
	{
		Node<E, K> newnode = new Node<E, K>(keys, data);
		if (head == null) 
		{
			head = newnode;
			current = head;
		} 
		
		else {
			temp = head;
			while (temp != null) 
			{
				if (temp.key == keys) 
				{
					temp.key = keys;
					temp.data = data;
				}
				temp = temp.next;
			}
			head = newnode;
			head.next = current;
			current = head;
		}
	}

	/**
	 * This method will check the number of times the data is present in the linked list
	 * It increments the count, the number of times data is present
	 */
	public void frequency(K data) 
	{
		int count = 0;
		temp = head;
		while (temp != null) 
		{
			if (temp.data == data) 
			{
				count++;
			}
			temp = temp.next;
		}
		System.out.println("Frequency of " + data + " is :" + count);
	}

	/**
	 * This function is used to delete the data passed
	 * 
	 * @return Nothing
	 */
	public void delete(K data) 
	{
		current = head;
		temp = current.next;
		if (current.data.equals(data)) 
		{
			head = current.next;
		}
		while (temp != null) 
		{
			if (temp.data.equals(data)) 
			{
				current.next = temp.next;
				System.out.println("Deleted " + temp.data );
			}
			temp = temp.next;
			current = current.next;
		}
		print();
	}
	
	//this method is used to check if linked list is empty 
	
	public Boolean isEmpty() 
	{
		temp = head;
		if (temp == null) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	//this method will print the linked list 
	
	public void print() 
	{
		Node<E, K> tempnode = head;
		if (!isEmpty()) 
		{
			while (tempnode.next != null) 
			{
				System.out.println(tempnode.data);
				frequency(tempnode.data);
				tempnode = tempnode.next;
			}
			System.out.println(tempnode.data);
			frequency(tempnode.data);
		} 
		else 
		{
			System.out.println("Empty Queue");
		}
	}
	
}
