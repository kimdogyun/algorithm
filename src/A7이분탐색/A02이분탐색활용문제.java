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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[N];
        for (int i = 0; i <N ; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        Arrays.sort(arr);
        int start = 0;
        int end = arr[arr.length-1];
        int answer = -1;
        while (start<=end){
            int mid = (start+end)/2;
            int total =0;
            for (int i = 0; i <arr.length ; i++) {
                total += (arr[i] > mid ? mid : arr[i]);
            }
            if (total<M){
                answer=mid;
                start=mid+1;

            } else if (total>M) {
                end = mid-1;

            } else if (total == M) {
                answer=mid;
                start=mid+1;
            }
        }
        System.out.println(answer);
//        과자 나눠주기 : 백준 =>과자길이를 이분탐색의 대상으로 선정 계산한값이 조카사람수 보다 크거나 같으면 answer 새팅
//        입국심사 : 백준
    }

}
