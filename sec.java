imo
public class sec {
    public static void main(String args[]){
        String input  = "what is you name";
        // StringBuilder output = new StringBuilder();
        String wrd = "";
        String[] arr = input.split[" "];
        int j = 0;
        for(int i= 0;i< input.length();i++){
            char ch = input.charAt(i);
            if(ch > 'a' || ch <'z'){
                wrd += ch;
                break;
            }
            if(ch == ' '){
                arr[j] = wrd;
                j++;
            }
        }
        for(int k =arr.length;k>0;k--){
            System.out.println(arr[k]);
        }
    }
}
