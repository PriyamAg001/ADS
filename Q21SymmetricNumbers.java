import java.util.Scanner;

public class Q21SymmetricNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        int ans=0;
        for(int i=low;i<=high;i++){
            if(i>9 && i<100){
                if(sol(i,1)) ans++;
            }else if(i>999 && i<10000){
                if(sol(i,2)) ans++;
            }
        }
        System.out.println(ans);
    }
    public static boolean sol(int n,int k){
        int sum=0;
        while(k>0){
            sum+=n%10;
            n/=10;
            k--;
        }
        while(n>0){
            sum-=n%10;
            n/=10;
        }
        return sum==0;
    }
}
