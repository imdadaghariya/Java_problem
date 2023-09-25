import java.util.Scanner;

public class Vo_con {
    public static void main(String []args){
        int vowel_count =0;
        int cons_count = 0;
        int ascii = 0;
        Scanner sc = new Scanner(System.in);
        // char[] vowel_arr = new char[]{'a','e','i','o','u','A','E','I','O','U'};
        String str = "Imdadhusain";
        for(int i = 0;i<str.length(); i++){
            ascii = str.charAt(i);
            if(ascii >=65 && ascii <= 122){
                if(ascii == 97 || ascii == 97 + 4 || ascii == 97+ 6){
                    vowel_count = vowel_count + 1;
                }
                else if(ascii == 65 || ascii == 65 + 4 || ascii == 97+6){
                    vowel_count = vowel_count + 1;
                }
                }
            }

                cons_count = cons_count+1;
                System.out.println(vowel_count +' ' + cons_count);
        }
    }

