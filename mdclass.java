import java.util.*;
public class mdclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int a = sc.nextInt();
        factorial f = new factorial();
        f.data(a);
        f.display(a);
    }
}
class factorial{
    int i=1,fact=1;
    void data(int x){
        while(i<=x){
            fact = fact * i;
            i++;
        }
    }   
    void display(int y){
        System.out.println("The Factorial of "+y+" is "+fact);
    }
}