package PuniCoreJavaConcepts.Varibles.Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo
{

	public static void main(String[] args)
	{
		PriorityQueue<Integer> qe = new PriorityQueue<Integer>();
		PriorityQueue<Integer> qe1 = new PriorityQueue<>();
         Queue<Integer> qe3 = new LinkedList<>();


{
	qe.add(1);
	qe.add(2);
	qe.add(3);
	qe.add(4);
	qe.add(5);
	
	System.out.println(qe);
	System.out.println("size of the set is --->"+qe.size());

	
	qe.remove(1);
	System.out.println(qe);
	System.out.println(qe.peek());//which is the 1st element in a set
	System.out.println(qe.poll());
	System.out.println("size of the set is --->"+qe.size());
	
}
	}

}
