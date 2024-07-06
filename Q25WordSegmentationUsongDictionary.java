import java.util.*;
public class Q25WordSegmentationUsongDictionary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String x=sc.next();
            list.add(x);
        }
        int memo[]=new int[s.length()+1];
        System.out.println(sol(s,list,memo));
    }
    public static boolean sol(String s,ArrayList<String> list,int[] memo){
        int n=s.length();
        if(n==0) return true;
        if(memo[n]!=0) return memo[n]==1;
        for(int i=1;i<=n;i++){
            String t=s.substring(0,i);
            if(list.contains(t)){
                if(sol(s.substring(i),list,memo)){
                    memo[n]=1;
                    return true;
                }
            }
        }
        memo[n]=-1;
        return false;
    }
}
