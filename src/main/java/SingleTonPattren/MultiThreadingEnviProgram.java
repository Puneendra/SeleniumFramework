package SingleTonPattren;

public class MultiThreadingEnviProgram
{
    public static void main(String[] args)
    {
        SingleTonMultiThreadingEnironMent.getInstance().printMessage();

        SingleTonMultiThreadingEnironMent aobj1 =  SingleTonMultiThreadingEnironMent.getInstance();
        SingleTonMultiThreadingEnironMent aobj2  =  SingleTonMultiThreadingEnironMent.getInstance();
        SingleTonMultiThreadingEnironMent aobj3  =  SingleTonMultiThreadingEnironMent.getInstance();

        System.out.println(aobj1.hashCode());
        System.out.println(aobj2.hashCode());
        System.out.println(aobj3.hashCode());



    }
}
