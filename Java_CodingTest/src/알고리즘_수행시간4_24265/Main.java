package 알고리즘_수행시간4_24265;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());
        //공식에 5를 대입해보면, i는 1~4만큼 돌고, j는 (i+1)~5만큼 돈다.
        //즉, i=1일때 4번, i=2일때 3번, i=3일때 2번, i=4일때 1번 수행된다.
        //1~n까지 합을 구하는 공식은 n(n+1)/2
        //따라서, 이중 for문의 총 수행 횟수는 (n-1)((n-1)+1)/2 = n(n-1)/2 이다.
        System.out.println(n*(n-1)/2);
        //최고차항은 n^2이므로, 차수는 2
        System.out.println(2);
        br.close();
    }
}
