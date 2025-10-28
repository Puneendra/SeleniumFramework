package PuniCoreJavaConcepts.Varibles.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo
{

	public static void main(String[] args)
	{
		List<Integer> numbers = Arrays.asList(18,29,11,25,99,45,100,1,1,2,24,4,24,100);
		
		//numbers.stream().filter(n -> n%2==1).forEach(System.out::println);
		
	//List<Integer>	sort = numbers.stream().filter(n-> n%2==1).collect(Collectors.toList());
	//System.out.println(sort);
		//numbers.stream().map(n-> n*n).forEach(System.out::println);
		
		//numbers.stream().distinct().forEach(System.out::println);
		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	

	}

}
