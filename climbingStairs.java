import java.util.Scanner;

public class climbingStairs {
    public static int solve(int n){
        // Step 1: Base Case
        if(n == 0 || n == 1){
            return 1;
        }

        // Step 2: RR
        int ans = solve(n-1) + solve(n-2);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = solve(n);
        System.out.println(ans);
    }
}