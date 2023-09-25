public class Remove{
    public static void main(String args[]){
        int a = 0f;
        int arr[] = new int[10];
        for(int i =0;i< arr.length;i++){
            arr[i] = i+1;
        }
        for(int j= 0;j<arr.length;j++){
            System.out.println(arr[j]);
            arr[a] = arr[j];
        }
    }
}