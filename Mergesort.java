import java.util.Scanner;
public class Mergesort
{
    public static void main(string []args) {
        int size;
        System.out.println("Enter the Size of the Array");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the element in the Array");
        for(int i= 0;i<=size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Elemnt of Array are");
        for(int i =0;i<=size;i++)
        {
            System.out.println(arr[i]);
        }
        int lb = 0;
        int ub = size-1;
        mergesort(arr,lb,ub);
        
    }
    static void mergesort(int arr[], int lb, int ub)
    {
        if(lb< ub)
        {
            int mid = (lb+ub)/2;
            mergesort(arr, lb, mid);
            mergesort(arr, mid+1, ub);
            merge(arr, lb,mid,ub);
        }
    }
    static void merge(int arr[], int lb, int mid, int ub)
    {
        int i,j,k;
        i= lb;
        j = mid+1;
        k = lb;
        int b[] = new int[ub];
        while(i<=mid&& j<=mid)
        {
            if(arr[i]< arr[j])
            {
                b[k] =arr[i];
                k++; i++;
            }
            else{
                b[k]= arr[j];
                k++; j++;
            }
        }
        if(i>mid)
        {
            while(j<=ub)
            {
                b[k]= arr[j];
                j++;k++;
            }
        }
        else{
            while(i<=mid)
            {
                b[k] = arr[i];
                i++; k++;
            }
        }
        System.out.println("The sorted Array is");
        for(int l=0;l<=ub;l++)
        {
            System.out.println(b[l]);
        }
    }
}
