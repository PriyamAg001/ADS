import java.util.*;

public class houseRobberII {
    public int solve(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i <= n; i++) {
            int incl = dp[i - 2] + nums[i - 1];
            int excl = dp[i - 1];
            dp[i] = Math.max(incl, excl);
        }

        return dp[n];
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        int[] first = Arrays.copyOfRange(nums, 0, n - 1);
        int[] second = Arrays.copyOfRange(nums, 1, n);

        return Math.max(solve(first), solve(second));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        houseRobberII solver = new houseRobberII();
        int maxAmount = solver.rob(nums);
        System.out.println("Maximum amount that can be robbed: " + maxAmount);
    }
}