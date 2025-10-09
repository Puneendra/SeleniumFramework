package SingleTonPattren;

public class PattrenDemo
{
    public static void main(String[] args)
    {
        SingletonPattrenDemo.getInstance().printMessage();

        SingletonPattrenDemo aobj =  SingletonPattrenDemo.getInstance();
        SingletonPattrenDemo aobj1 =  SingletonPattrenDemo.getInstance();
        SingletonPattrenDemo aobj2 =  SingletonPattrenDemo.getInstance();


        System.out.println(aobj.hashCode());
        System.out.println(aobj1.hashCode());
        System.out.println(aobj2.hashCode());




    }
}
