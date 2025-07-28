package 블랙잭_2798;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] num = new int[N];
        for(int i = 0; i<N; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        //브루트 포스 문제. 3장의 카드를 쓰면서 가능한 모든 조합을 해야한다.
        //3중 for문으로 0~(N-2), (i+1)~(N-1), (j+1)~N 까지 돌면서 모든 경우의 수를 수행해본다.
        int max = 0;
        for(int i = 0; i<N-2; i++){
            for(int j = i+1; j<N-1; j++){
                for(int k = j+1; k<N; k++){
                    int sum = num[i] + num[j] + num[k];
                    if(sum<=M){
                        max = Math.max(max,sum);
                    }
                }
            }
        }
        br.close();
        System.out.println(max);
    }
}
