package 커트라인_25305;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] score = new int[N];
        for(int i = 0; i<N; i++){
            score[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(score);
        //배열 뒤집기
        for(int i = 0; i<score.length / 2; i++){
            int temp = score[i];
            score[i] = score[score.length-1-i];
            score[score.length-1-i] = temp;
        }
        System.out.println(score[k-1]);

        br.close();
    }
}
