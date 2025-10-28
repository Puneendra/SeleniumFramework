package PuniCoreJavaConcepts.Varibles.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDemo
{

	public static void main(String[] args) 
	 {
		LinkedList<String> l1 = new LinkedList <String>();
		l1.add("Puni");
		l1.add("samana");
		l1.add("java");
		l1.add("collections");
		l1.add("LinkedList");
		System.out.println(l1);
		
		ArrayList i = new ArrayList();
		i.add("Puni");
		i.add(10);
		i.add(null);
		i.add("Puni");
		
		LinkedList <Integer>l2 = new LinkedList<Integer>(i );// Here converting ArrayList into Linked list
	//	LinkedList <String> Li = new ArrayList<String>()--->one method by mohan 
		
		//ArrayList<String> list1 =new ArrayList<String>(Arrays.asList(arr1));

		System.out.println(i);
		
		i.add("mahi");
		i.add("Haswik");
		i.add("Tanu");
		System.out.println(i);
		
		i.set(0, "JAVA SELENIUM");
		
		i.add(1, "JAVA Collections");
		System.out.println(i);
		
		i.removeLast();
		System.out.println(i);
		
		i.addFirst("LinkedList");
		System.out.println(i);
		System.out.println(i.indexOf("Puni"));
		System.out.println(i.lastIndexOf("mahi"));
		System.out.println(i.reversed());//from collections
		
		
		
		
		

	}

}
