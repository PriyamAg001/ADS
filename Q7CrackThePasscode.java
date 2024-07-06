import java.util.*;

public class Q7CrackThePasscode {
    public static boolean isValid(String str, String t){
        int idx = str.indexOf(t);
        if(idx == -1 || idx > 0){
            return false;
        }

        int n = t.length();
        str = str.substring(n);
        idx = str.indexOf(t);

        int x = str.length() - t.length();
        if(idx == -1 && idx != x){
            return false;
        }
        idx = str.lastIndexOf(t);
        return idx == x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        for(int i=0; i<str.length(); i++){
            if(isValid(str, str.substring(0, i+1))){
                ans = str.substring(0, i+1);
            }
        }
        System.out.println(ans);
    }
}
