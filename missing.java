public class missing{
    public static void main(String []args)
    {
        int arr1[] = new int[]{1,2};
        int arr2[] = new int[]{3,4};
        int arr[] = new int[4];
        int i=0,j =0,k=0;
        while(i<2 && j<2)
        {
            if(arr1[i]<arr2[j])
            {
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        int mid = 2;
        int mid1 = mid+1;
        int median =(arr[mid]+ arr[mid1])/2;
        System.out.println(median);
    }
}