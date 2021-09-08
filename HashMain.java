package com.bridgelabzhash;

public class HashMain {

	public static void main(String[] args) {
		
		HashTable<Integer, String> hash = new HashTable<Integer, String>();
		String[] paragraph = {"Paranoids","are" ,"not" ,"paranoid" ,"because" ,"they" ,"are" ,"paranoid", "but" ,"because" ,"they" ,"keep" ,"putting" ,"themselves" ,"deliberately" ,"into" ,"paranoid" ,"avoidable" ,"situations"};

		for(int i=0;i<paragraph.length;i++)
		{
			hash.insertNode(i, paragraph[i]);
		}
		hash.print();
		
		hash.delete("avoidable");

	}
}
