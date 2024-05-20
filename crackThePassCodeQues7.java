import java.util.Scanner;

public class crackThePassCodeQues7 {
    public static boolean isValid(String s, String t){
        int idx = s.indexOf(t);
        if(idx < 0 || idx > 0){
            return false;
        }
        int len = t.length();
        s = s.substring(len);
        idx = s.indexOf(t);
        int diff = s.length() - t.length();
        if(idx == -1 || idx != diff){
            return false;
        }
        idx = s.lastIndexOf(t);
        return idx == diff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = " ";
        for(int i=0; i<s.length() / 3; i++){
            if(isValid(s, s.substring(0, i+1)));
            ans= s.substring(0, i+1);
        }
        System.out.println(ans);
    }
}
