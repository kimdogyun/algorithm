package A7이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
//이분탐색문제는 이분탐색의 대상을 어떤것으로 설정할지가 핵심
public class A02이분탐색활용문제 {
    public static void main(String[] args) throws IOException {
        //    예산 : 백준 => 상한액을 이분탐색 대상으로 선정.계산한 값이 총예산보다 작거나같으면 answer 새팅
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N =Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int [] arr = new int[N];
//        for (int i = 0; i <N ; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//        }
//        int M = Integer.parseInt(br.readLine());
//        Arrays.sort(arr);
//        int start = 0;
//        int end = arr[arr.length-1];
//        int answer = -1;
//        while (start<=end){
//            int mid = (start+end)/2;
//            int total =0;
//            for (int i = 0; i <arr.length ; i++) {
//                total += (arr[i] > mid ? mid : arr[i]);
//            }
//            if (total<M){
//                answer=mid;
//                start=mid+1;
//
//            } else if (total>M) {
//                end = mid-1;
//
//            } else if (total == M) {
//                answer=mid;
//                start=mid+1;
//            }
//        }
//        System.out.println(answer);
//        과자 나눠주기 : 백준 =>과자길이를 이분탐색의 대상으로 선정 계산한값이 조카사람수 보다 크거나 같으면 answer 새팅
//        입국심사 : 백준
        // 심사대 N개가 있고, k번 심사대는 사람 1명 처리에 Tk초 걸려요. 사람은 총 M명.
// 사람들은 “빈 심사대가 보이면 바로 갈 수도 있고, 더 빠른 곳이 끝날 때까지 기다렸다가 갈 수도 있음”.
// 목표는 모든 M명이 심사를 끝내는 데 걸리는 시간(마지막 사람 종료 시간)을 최소화하는 값 구하기.
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int [] T = new int[N];
            int max = 0;
            for (int i = 0; i <N ; i++) {
                T[i]=Integer.parseInt(br.readLine());
                max = Math.max(max,T[i]);

            }
            int start = 0;
            int end = max*M;
            int answer = 1;
            while(start<=end){
                int mid = (start+end)/2;
                int sum=0;
                for (int a : T){
                    sum+=mid/a;
                }
                if (sum >= M) {
                    answer = mid;
                    end = mid - 1;
                } else {
                    start = mid + 1;

                }
            }
            System.out.println(answer);

        }

}
