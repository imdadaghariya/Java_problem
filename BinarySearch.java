import java.util.Scanner;
class BinarySearch{
    public static void main(String []args)
    {
        int size;
        System.out.println("Enter the Size of array");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        int mid, first=0,last = size-1;
        mid = (first +last)/2;
        System.out.println("Enter the Elemnt in the Array");
        for(int i =0;i<size;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Element in the Array are");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Enter the Elemnt to Search");
        int key = sc.nextInt();
        while(first<last)
        {
            if(arr[mid]== key)
            {
                System.out.println("The Elemnt Found " + arr[mid]+ "At Inderx "+ mid);
            }
            else if(arr[mid]< key)
            {
                first = mid +1;
                mid = (first+last)/2;
            }
            else{
                last = mid -1;
                mid = (first+last)/2;
            }
        }
    }

    }
