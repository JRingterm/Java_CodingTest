package 진법_변환_2745;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int result = 0;
        int num = 1; //자릿수에 맞는 진법

        // 36진법 ZZZZZ -> 10진법
        // 35 * 36^0 = 35, 35 * 36^1 = 1,260, 35 * 36^2 = 45,360 ... 이런식
        for(int i = N.length() - 1; i >= 0; i--){ //제일 작은 자릿수부터 시작
            char digits = N.charAt(i);

            //알파벳을 숫자로 계산하려면 아스키코드를 사용하는데, 문제에서는 알파벳에 해당하는 숫자가 아스키코드와 다름.
            //따라서, A~Z 범위의 문자라면, (A의 원래 아스키코드인 65 - 문제에서 A의 값인 10) = 55를 빼주어 아스키코드와 문제간의 차이를 맞춘다.
            if ('A' <= digits && digits <= 'Z'){
                result += (digits-55) * num;
            }
            //알파벳이 아니면, 0의 아스키 코드인 48을 빼준다.
            else
                result += (digits-48) * num;

            //자릿수 증가에 따른 계산.
            num *= B;
        }
        System.out.println(result);
        br.close();
    }
}
