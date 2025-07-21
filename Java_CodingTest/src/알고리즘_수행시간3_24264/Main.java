package 알고리즘_수행시간3_24264;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //n은 (1<=n<=500,000)의 범위를 가지는데, 이를 제곱하면 int로는 overflow가 발생한다.
        //int의 범위는 10^9까지, long의 범위는 10^18까지
        long n = Integer.parseInt(br.readLine());
        //이중 반복문이기 떄문에 수행횟수는 n^2이 된다.
        System.out.println(n*n);
        //n^2의 최고차항의 차수는 2이다.
        System.out.println(2);
    }
}
