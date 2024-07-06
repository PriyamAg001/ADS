import java.util.Scanner;

public class Q43IsomorphicString {
    public static boolean sol(String s1,  String s2){
        int[] map1 = new int[128];
        int[] map2 = new int[128];

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        for(int i=0; i<arr1.length; i++){
            if(map1[arr1[i]] != map2[arr2[i]]){
                return false;
            }
            map1[arr1[i]] = map2[arr2[i]] = i+1;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        boolean ans = sol(s1, s2);
        if(ans){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}


