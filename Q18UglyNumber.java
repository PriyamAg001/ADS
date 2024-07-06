import java.util.Scanner;

public class Q18UglyNumber {
    public static boolean sol(int n){
        if(n <= 0){
            return false;
        }
        while(n%2 == 0){
            n /= 2;
        }
        while(n%3 == 0){
            n /= 3;
        }
        while(n%5 == 0){
            n /= 5;
        }
        return n==1;
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sol(n));
    }
}
