package A6투포인터;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//정렬을 하면 안되는 경우
//start<=end의 조건
//start와 end가 같이 출발
public class A03수열의범위 {
    //    수들의 합2(2003) : 백준
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int target = M;
        int count = 0;
        int start = 0;
        int end = 0;
        int sum = arr[start];
        while (start<=end && end< arr.length) {
            if (sum==target) {
                count++;
                end++;
                if (arr.length==end)break;
                sum+=arr[end];
            }else if (sum<M){
                end++;
                if (arr.length==end)break;
                sum+=arr[end];
            } else if (sum>M) {
                sum-=arr[start];
                start++;
                if (start>end){
                    end++;
                    if (arr.length==end)break;
                    sum+=arr[end];
                }
            }
        }
            System.out.println(count);

//        연속된 부분수열의합 : 프로그래머스

//        숫자의 표현 : 프로그래머스

        }
    }
