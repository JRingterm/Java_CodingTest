package 수학은_체육과목입니다_15894;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //n의 범위가 int를 초과하므로 long 사용.
        long n = Integer.parseInt(br.readLine());

        System.out.println(n*4);
    }
}
