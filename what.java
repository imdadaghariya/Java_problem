
public class what{
    public static void  main(String []args)
    {
        String str ="ashashimdadishdadhijab";
        int arr[]  = new int[26];
        for(int i =0;i<str.length();i++)
        {
            arr[str.charAt(i)-'a']=arr[str.charAt(i)-'a']+1;
        }
        System.out.println("Frequency are");
        for(int i=0;i<26;i++)
        {
            if(arr[i]>0)
            {
                System.out.println((char)(i+'a')+" "+ arr[i]);
            }
        }
    }
}