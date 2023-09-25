public class thread_class {
    /**
     * @param args
     */
    public static void main(String []args)
    {
        A o1 =new A();
        B o2 =new B();
        o1.run();
        o2.run();
    }
    
}
class A extends Thread{
    public void run()
    {
        int i=1;
        for(i=1;i<=10;i++)
        {
        System.out.println("Thread A"+ "i ="+i);
        }
    }
}
class B extends Thread{
    public void run()
    {
        int i=1;
        for(i=1;i<=10;i++)q
        {
        System.out.println("Thread B"+ "i ="+i);
        }
    }
}
