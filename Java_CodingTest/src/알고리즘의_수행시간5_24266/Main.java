package 알고리즘의_수행시간5_24266;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        //삼중 for문. n이 5라면, i는 1~5, j는 1~5, k는 1~5 총 n^3번 수행한다.
        System.out.println(n*n*n);
        //최고차항은 n^3이므로, 차수는 3
        System.out.println(3);
        br.close();
    }
}
