package PuniCoreJavaConcepts.Varibles.Inheritance;

class M
{
    void display() 
    {
        System.out.println("Display from M");
    }
}

class N extends M 
{
    void display() 
    {
        System.out.println("Display from N");
    }

    public static void main(String[] args)
    {
        M obj = new N();
        obj.display();
    }
}