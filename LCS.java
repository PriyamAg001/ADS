import java.util.*;

public class LCS {
    public static int  solve(String s1,String s2, int i, int j, int[][] dp) {
        // Step 1: Base Case
        if(i == s1.length() || j == s2.length()){
            return 0;
        }

        // Step 3:
        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        // Step 2: RR
        int ans;
        if(s1.charAt(i) == s2.charAt(j)){
            ans = 1 + solve(s1, s2, i+1, j+1, dp);
        }
        else{
            ans = Math.max(solve(s1, s2, i+1, j, dp), solve(s1, s2, i, j+1, dp));
        }

        dp[i][j] = ans;
        return dp[i][j];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n][m];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        int ans = solve(s1, s2, 0, 0, dp);
        System.out.println(ans);
    }
}