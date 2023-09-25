import java.lang.Runnable;
public class Main{
    public static void main(String []args)
    {
        exp obj = new exp();
        Thread thread = new Thread(obj);
        // obj.run();
        thread.start();
        System.out.println("Hello world");
    }
}
class exp implements  Runnable{
    public void run()
    {
        System.out.println("HEllo world is from the thread");
    }
}   