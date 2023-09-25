import java.util.*;
import java.lang.String;
public class sttt{
    public static void main(String args[])
    {
       String str = "ab2cd3";
       StringBuilder result = new StringBuilder();
       char arr[] = str.toCharArray();
       for(int i = 0;i< arr.length;i++){
        char ch = arr[i];
        if(Character.isDigit(ch)){
            int repeatcount = Character.getNumericValue(ch);
            if(repeatcount >0){
                
            }
        }
       }
    }
}