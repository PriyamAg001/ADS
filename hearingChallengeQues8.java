import java.util.*;

public class hearingChallengeQues8 {
    public static boolean isValid(String s){
        String x = "Yes";
        if(x.indexOf(s) != -1){
            return true;
        }
        for(int i=0; i<s.length(); i++){
            if(x.indexOf(s.charAt(i)) == -1){
                return false;
            }
        }

        int count  = 1;
        String ans = "Yes";
        while(count <=  s.length() / ans.length() + 2) {
            if (x.indexOf(s) != -1) {
                return true;
            }
            x += ans;
            count++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            if(isValid(s)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
