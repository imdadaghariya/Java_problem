import java.util.*;
import java.lang.*;
public class stringleet {
    public static void main(String []args){
        String start = "RXXLRXRXL";
        String end = "RLXXRRLX";

    }
}


class solution{
    public boolean sol(String start, String end){
        int len =start.length();
        char[] s1 = new char[len];
        char[] s2 = new char[len];
        s1 = start.toCharArray();
        s2 = end.toCharArray();
        for(int i=0;i<len;i++){
            if(s1[i]=='X' && s1[i+1]=='L'){
                char temp = s1[i];
                s1[i]= s1[i+1];
                s1[i+1]= temp;
            }
            if(s1[i]=='R' && s1[i+1]=='X'){
                char temp = s1[i];
                s1[i]= s1[i+1];
                s1[i+1]= temp;
            }
        }
        for(int i =0;i<len;i++){
            String start = 
        }
        return false;

    }
}
