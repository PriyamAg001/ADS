import java.util.Scanner;

public class TowerOfHanoi {
    public static void tofh(int n, char from, char to, char aux){
        if(n == 0){
            return;
        }
        tofh(n-1, from, aux, to);
        System.out.println("Move disk " + n + " from rod " + from + " to rod " + to);
        tofh(n-1, aux, to, from);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tofh(n, 'A', 'C', 'B');
    }
}
