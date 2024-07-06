import java.util.*;

public class Q5DecodeWays {
    public static int sol(String s,Integer[] memo) {
        int n = s.length();
        if (n == 0) return 1;
        if (s.charAt(0) == '0') return 0;
        if (memo[n] != null) return memo[n];
        int ans = sol(s.substring(1), memo);
        if (s.length() > 1) {
            if ((s.charAt(0) == '1' || s.charAt(0) == '2') && s.charAt(1) < '7') {
                ans += sol(s.substring(2), memo);
            }
        }
        return memo[n] = ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Integer[] memo=new Integer[s.length()+1];
        System.out.println(sol(s,memo));
    }
}