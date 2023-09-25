import java.util.Scanner;
public class LinearSearch {
    public static void main(String []args)
    {
        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int first=0,last, mid;
        last= size-1;
        mid= (first+last)/2;
        System.out.println("Enter the Size of the Array");
        int arr[] = new int[size];
        System.out.println("Enter the Element in the array ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Element in the array arre");
        for(int i =0;i<size;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("Enter the Element to search in the array");
        int key = sc.nextInt();
        for(int i =0 ;i<size;i++)
        {
            if(arr[i]== key)
            {
                System.out.println("THe key is found at"+ i);
            }
        }        
    }
}
