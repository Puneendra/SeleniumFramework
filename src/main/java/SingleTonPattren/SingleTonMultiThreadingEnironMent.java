package SingleTonPattren;

public class SingleTonMultiThreadingEnironMent
{
    private static SingleTonMultiThreadingEnironMent instance;

    private SingleTonMultiThreadingEnironMent()
    {

    }

    public static SingleTonMultiThreadingEnironMent getInstance()
    {
        if(instance == null)
        {
            synchronized(SingleTonMultiThreadingEnironMent.class)
            {
                if(instance == null)
                {
                    instance = new SingleTonMultiThreadingEnironMent();
                }
            }
        }
        return instance;
    }


    public  void  printMessage()
    {
        System.out.println("This is a an singleTon Pattren on MultiThreading Environment ");
    }

}
