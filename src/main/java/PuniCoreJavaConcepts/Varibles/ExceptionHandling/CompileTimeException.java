package PuniCoreJavaConcepts.Varibles.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeException
{

	public static void main(String[] args) 
	{
		try
		{
			FileReader fl = new FileReader("D:\\Puni\\abc.txt");
		}
		catch(FileNotFoundException e)
		{
			//e.getMessage()
			System.out.println(e.getMessage());
		}

	}

}
