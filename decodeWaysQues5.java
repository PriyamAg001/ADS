import java.util.Scanner;

public class decodeWaysQues5 {
    public static int sol(String s, int[] arr) {
        int n = s.length();
        if (n == 0) {
            return 1;
        }
        if (s.charAt(0) == '0') {
            return 0;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        int ans = sol(s.substring(1), arr);
        if (s.length() > 1) {
            if ((s.charAt(0) == '1' || s.charAt(0) == '2') && s.charAt(1) < '7') {
                ans += sol(s.substring(2), arr);
            }
        }
        return arr[n] = ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] arr = new int[s.length() + 1];
        System.out.println(sol(s, arr));
    }
}
