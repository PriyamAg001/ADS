import java.util.*;

public class houseRobber {
    public static int solve(ArrayList<Integer> list, int n) {
        // Step 1: Base Case
        if (n < 0) {
            return 0;
        }

        // Step 2: Recursive Relation
        int incl = solve(list, n - 2) + list.get(n);
        int excl = solve(list, n - 1);
        return Math.max(incl, excl);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int element = sc.nextInt();
            if (element == -1) {
                break;
            }
            list.add(element);
        }

        int n = list.size();
        int ans = solve(list, n - 1);
        System.out.println(ans);
    }
}
