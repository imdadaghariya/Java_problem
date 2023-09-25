public class string {
    public static void main(String args[])
    {
        String name = "ashashimdadishdadhijab";
        int str_size = name.length();
        char[] str_name = new char[str_size];
        System.out.println(str_size);
        // Storing String into array
        for(int i =0;i<str_size;i++)
        {
            str_name[i]=name.charAt(i);
        }
        //print the array
        for(int j =0;j<str_size;j++)
        {
            System.out.println(str_name[j]);
        }
        // Types and number of Alphabet in the String


        // char[] char_alpha = new char[30];
        // for(char c = 'a';c< 'z';c++)
        // {
        //     char_alpha[c] = c;
        // }
        // for(int k=0;k<=25;k++)
        // {
        //     System.out.println(char_alpha[k]);
        // }

        char[] str_alpha = new char[30];
        String str_alphabet = "abcdefghijklmnopqrstuvwxyz";
        int str_alpha_size = str_alphabet.length();
        str_alpha = str_alphabet.toCharArray();
        //Traversing the array
        int i=0;
        char[] str_alpha_avl = new char[str_size];
        for(int m =0;m<str_size;m++)
        {
            for(int q = 0;q<i;q++)
            {
                if( str_alpha_avl[q]==str_alpha[q])
                {
                    break;
                }
                else
                {
                    continue;
                }
            }
            for(int l=0; l<str_alpha_size;l++)
            {
                if(str_alpha[l] ==str_name[m])
                {
                    str_alpha_avl[i]= str_alpha[l];
                    i++;
                    break;
                } 
            }
        }
        // Printing the str_alpha_avl arr
        int str_alpha_avl_size =str_alpha_avl.length;
        System.out.println("str_alpha_avl Array"+str_alpha_avl_size);
        for(int g =0;g<i;g++)
        {
            System.out.println(str_alpha_avl[g]);
        }
    }

    public string[] toCharArray;
}
