package 알고리즘의_수행시간2_24263;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //반복문이 1개 존재하기 때문에, n번 수행된다.
        System.out.println(n);
        //n번 수행되므로 최고차항의 차수는 1이다.
        System.out.println(1);
    }
}
