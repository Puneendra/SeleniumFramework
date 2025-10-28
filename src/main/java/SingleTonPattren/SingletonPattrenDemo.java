package SingleTonPattren;

import org.apache.commons.collections4.bag.SynchronizedBag;

public class SingletonPattrenDemo
{
    private static  SingletonPattrenDemo instance ;

    private SingletonPattrenDemo()
    {

    }

    public static SingletonPattrenDemo getInstance()
    {

        if(instance == null)
        {

            instance = new SingletonPattrenDemo();

        }




        return instance;

    }

    public void printMessage()
    {
        System.out.println("This is the message from SingletonPattrenDemo");
    }

}
