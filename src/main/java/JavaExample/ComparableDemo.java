package JavaExample;

import java.util.*;

class Student implements Comparable <Student>
{
    String name;
    int id;
    int roll;
    public Student(String name,int id,int roll)
    {
        this.name=name;
        this.id=id;
        this.roll=roll;
    }

    @Override
    public int compareTo(Student o)
    {
        return this.roll-o.roll;
    }
    public String toString()
    {
        return this.name+roll+id;
    }
}

public class ComparableDemo
{
    public static void main(String[] args)
    {
        List<Student > l = new ArrayList< >();
        l.add(new Student ("puni",20,20));
        l.add(new Student ("Honey",30,30));
        l.add(new Student ("Thanu",40,40));
        Collections.sort(l);

        System.out.println(l);

    }
}
