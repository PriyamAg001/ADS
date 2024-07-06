import java.util.Scanner;

public class Q19ReduceTargetToZero {
    public static int sol(int n){
        if(n == 0){
            return 0;
        }
        if(n%2 == 0){
            return (1 + sol(n/2));
        }
        else{
            return 1 + sol(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sol(n));
    }
}
