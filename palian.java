public class palian {
    public static void main(string []args)
    {
        String str ="abcdcba";
        int length=str.length();
        System.out.println(length);
        if(length %2== 1)
        {
            int i =0;
            int j = length-1;
            int count= 0;
            while(i<j)
            {
            if(str.charAt(i)!= str.charAt(j))
            {
                System.out.println("not");
            }
            else{
                i++;
                j--;
            }
            
        }

        }
    }
}
