import java.util.Scanner;
public class str_len {
    public static void main(String[] args){
        System.out.println("Enter the String");
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        str.toLowerCase();
        System.out.println(str);
        char[] arr = str.toCharArray();
        int count = 0;
        for(char ch = 'a';ch < 'z';ch++){
            for(int i =0 ;i< arr.length;i++){
                if(ch == arr[i]){
                    count++;
                }
            }
            if(count >= 1)
                System.out.println(ch + "" + count);
            count =0;
        }
    }
}
