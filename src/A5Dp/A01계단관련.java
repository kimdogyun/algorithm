package A5Dp;

public class A01계단관련 {
    public static void main(String[] args) {
//        멀리뛰기 : 프로그래머스
        int n =4;
//        n번쨰 자리의 경우의 수는 n-1번째의 경우의수와 n-2번째 경우의 수의 합
        if(n==1)return;
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <dp.length ; i++) {
            dp[i] = (dp[i-1]%1234567 + dp[i-2]%1234567)%1234567;

        }
//        계단오르기 : 백준
    }
}
