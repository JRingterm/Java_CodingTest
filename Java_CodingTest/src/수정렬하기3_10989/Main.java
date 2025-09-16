package 수정렬하기3_10989;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];

        for(int i = 0; i<N; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);
        //15552번 빠른 A+B 문제 참조. System.out.println()은 느리기 때문에, BufferedWriter를 사용했다.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<N; i++){
            bw.write(num[i]+"\n");
        }
        br.close();
        bw.close();
    }
}
