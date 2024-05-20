import java.util.Arrays;
import java.util.Scanner;

public class LIS {
    public static int solve(int n, int[] arr, int curr, int prev, int[][] dp){
        // Step 1: Base Case
        if(curr == n){
            return 0;
        }

        // Step 3:
        if(dp[curr][prev + 1] != -1){
            return dp[curr][prev + 1];
        }

        // Step 2: RR
        int take = 0;
        if(prev == -1 || arr[curr] > arr[prev]){
            take = 1 + solve(n, arr, curr + 1, curr, dp);
        }
        int notTake = solve(n, arr, curr + 1, prev, dp);
        int ans = Math.max(take, notTake);
        dp[curr][prev + 1] = ans;
        return dp[curr][prev + 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int[][] dp  = new int[n][n];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[i].length; j++){
                dp[i][j] = -1;
            }
        }

        int ans = solve(n, arr, 0, -1, dp);
        System.out.println(ans);
    }
}

