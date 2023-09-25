import java.util.Scanner;
// import java.util.function.Function;
public class QuickSort {
    public static void main(String []args)
    {
        int size;
        System.out.println("Enter the Size");
        try (Scanner sc = new Scanner(System.in)) {
            size = sc.nextInt();
            int arr[] =new int[size];
            int low, high;
            low = 0;
            high = size-1;
            System.out.println("Enter the elkement intbehbeabsfjwes");
            for(int i=0;i<size;i++)
            {
                arr[i]= sc.nextInt();
            }
            System.out.println("the element enteredin the aray are");
            for(int i=0;i<size;i++)
            {
                System.out.println(arr[i]);
            }
            quicksort(arr, low,high);
        }
    }

    static void quicksort(int[] arr, int lb, int ub)
    {
      if(lb < ub)
        {
            int loc = partation(lb, ub, arr);
            quicksort(arr, lb ,loc-1);
            quicksort(arr, loc+1 ,ub);
        }
    }
    static int partation(int lb, int ub, int arr[])
    {
        int pivot = arr[lb];
        int start = lb;
        int end = ub;
        while(start< end)
        {
            while(arr[start]< pivot )
            {
                start++;
            }
            while(arr[end]> pivot)
            {
                end--;
            }
            if(start < end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        int temp_pivot = arr[lb];
        arr[lb] = arr[end];
        arr[lb] = temp_pivot;
        return end;
    }
   
}
