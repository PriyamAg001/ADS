import java.util.*;

public class knapsackProblemQues1 {
    public static int knapsack(int[] weight, int[] profit, int capacity, int n) {
        // Base Case:
        if(n == 0 || capacity == 0){
            return 0;
        }

        if(weight[n-1] > capacity){
            return knapsack(weight, profit, capacity, n-1);
        }

        int include = profit[n-1] + knapsack(weight, profit, capacity - weight[n-1], n-1);
        int exclude = knapsack(weight, profit, capacity, n-1);

        return Math.max(include,  exclude);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] weight = new int[n];
        int[] profit = new int[n];
        for(int i=0; i<n; i++){
            weight[i] = sc.nextInt();
            profit[i]= sc.nextInt();
        }

        int capacity = sc.nextInt();

        int maxProfit = knapsack(weight, profit, capacity, n);
        System.out.println(maxProfit);
    }
}
