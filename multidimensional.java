import java.util.Scanner;
public class multidimensional {
    public static void main(String []args)
    {
        int rows, cols;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();
        int arr[][] =new int[rows][cols];
        System.out.println("Enter the Value array");
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0 ;j<=cols;j++)
            {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("The Array is");
        for(int i = 0;i<=rows;i++)
        {
            for(int j = 0;j<= cols;j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}
