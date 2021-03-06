import java.util.*;

class minJumps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i] = sc.nextInt();
        }
        int dp[] = new int[N];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<i;j++)
            {
                if( i <= arr[j] + j)  dp[i] = Math.min(dp[i],1+dp[j]);
            }
        }
        for(int i :dp)
        {
            System.out.print(i+" ");
        }


    }
}