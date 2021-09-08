package com.bridgelabzhash;

public class HashMain {

	public static void main(String[] args) {
		
		HashTable<Integer, String> hash = new HashTable<Integer, String>();

		hash.insertNode(1, "to");
		hash.insertNode(2, "be");
		hash.insertNode(3, "or");
		hash.insertNode(4, "not");
		hash.insertNode(5, "to");
		hash.insertNode(6, "be");
		hash.print();

	}
}
