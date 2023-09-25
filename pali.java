class pali{
    public static void main(String[] agrs)
    {
        int onum= 10111;
        int num= 10111;
        int rev = 0;
        int rem;
        while(num!=0)
        {
            rem = num %10;
            rev = rev*10+rem;
            num = num/10;
        }
        int res = rev;
        System.out.println(res);
        if(res == onum)
        {
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
}
}ashashimdadishdadhijab