package 중앙_이동_알고리즘_2903;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        /*
        int dot = 2;
        int result = 0;

        //4, 9, 25, 81
        for(int i = 0; i < N; i++){
            dot = dot + (dot - 1);
            result = dot * dot;
        }
         */
        //점의 개수 = (2^n + 1)^2
        System.out.println((int)Math.pow(Math.pow(2, N) + 1, 2));
        br.close();
    }
}
