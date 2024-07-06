import java.util.Scanner;

public class Q22CountWaysToCoverDistance {
    public static int sol(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        return sol(n-1) + sol(n-2) + sol(n-3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sol(n));
    }
}
