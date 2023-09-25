class Solution {
    public int[] twoSum(int[] arr, int target) {
        int i = 0;
        int j = i+1;
        int k =0;
       int ind[] = new int[2];
        for(i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
            {
                if((arr[i]+arr[j])== target)
                {
                    ind[k]= i;
                    k++;
                    ind[k]= j;
                    k++;
                }
            }
        }
        return ind;
    }
}