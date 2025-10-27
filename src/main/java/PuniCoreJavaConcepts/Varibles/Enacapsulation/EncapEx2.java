package PuniCoreJavaConcepts.Varibles.Enacapsulation;

public class EncapEx2 
{
private String name;
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name = name;
}

	public static void main(String[] args) 
	{
		EncapEx2 aobj = new EncapEx2 ();
		aobj.setName("puneendra");
		System.out.println(aobj.getName());

	}

}
