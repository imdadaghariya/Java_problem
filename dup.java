public class dup {
    public static void main(String args[]){
        int j =0;
        int arr[] = new int[]{1,1,2,2,3};
        int arr2[] = new int[arr.length];
        for(int i =0;i<arr.length;i++){
           if(i ==0 || arr[i] != arr[i-1]){
                arr2[j] = arr[i];
                j++;
           }
        }
        for(int k =0;k<arr2.length;k++){
            System.out.println(arr2[k]);
        }

    }
}
