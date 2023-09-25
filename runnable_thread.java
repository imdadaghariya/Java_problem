import java.util.Scanner;
public class runnable_thread{
    public static void main(String []args)
    {
        A objA = new A();
        B objB = new B();
        Thread t1 = new Thread(objA);
        Thread t2 = new Thread(objB);
        t1.start();
        t2.start();

    }
}
class A implements Runnable{
    public void run()
    {
        int i;
        for(i =0;i<=10;i++)
        {
            System.out.println("Thread A  "+i);
        }
    }
}
class B implements Runnable{
    public void run()
    {
        int i;
        for(i =0;i<=10;i++)
        {
            System.out.println("Thread B  "+i);
        }
    }
}

public class main(String []args)
{
    public static void main(string[] agrs)
    {
        int a;
    }
    
}