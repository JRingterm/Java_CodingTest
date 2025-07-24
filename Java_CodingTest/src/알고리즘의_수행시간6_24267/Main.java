package 알고리즘의_수행시간6_24267;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());
        //삼중 for문. i는 1~(n-2), j는 (i+1)~(n-1), k는 (j+1)~n 까지 반복된다.
        //이를 n부터 m까지의 수의 합은 시그마로 나타낼 수 있으며,
        //시그마 공식에 따라 정리하면, n(n-1)(n-2)/6 이 나온다.
        System.out.println((n*(n-1)*(n-2))/6);
        //최고차항은 n^3이므로 차수는 3
        System.out.println(3);
        br.close();
    }
}
