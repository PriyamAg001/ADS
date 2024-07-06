import java.util.Scanner;

public class Q17DifferenceInASCIICodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            int n = s.charAt(i) - s.charAt(i-1);
            System.out.print(n + " " + s.charAt(i));
        }
    }
}
