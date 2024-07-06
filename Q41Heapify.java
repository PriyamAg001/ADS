import java.util.*;

public class Q41Heapify {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            pq.add(x);
        }
        for(int i:pq) System.out.print(i+" ");
    }
}