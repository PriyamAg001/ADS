import java.util.Scanner;

public class Q10LongestIncreasingSubsequence {
    public static int solve(int[] arr, int n, int curr, int prev, int[][] dp){
        // Step 2: Base Case
        if(curr == n){
            return 0;
        }

        // Step 4: Check
        if(dp[curr][prev + 1] != -1){
            return dp[curr][prev + 1];
        }

        // Step 3: RR
        // Include: Take Case
        int take = 0;
        if(prev == -1 || arr[curr] > arr[prev]){
            take = 1 + solve(arr, n, curr + 1, curr, dp);
        }

        // Exclude: Not Take Case:
        int notTake = solve(arr, n, curr + 1, prev, dp);

        dp[curr][prev + 1] = Math.max(take, notTake);
        return dp[curr][prev + 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // Step 1: Create DP
        int[][] dp = new int[n][n];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        System.out.println(solve(arr, n, 0, -1, dp));
    }
}
