import java.util.Scanner;
public class primeno {
    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int count =0;
        if(num == 1){
            System.out.println("Is Prime");
        }
        else{
            for(int i=2;i<num/2;i++){
                if(num % i==0){
                    count++;
                }
            }
            if(count >= 1){
                System.out.println("Is not Prime");
            }
        }
    }