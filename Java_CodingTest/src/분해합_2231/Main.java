package 분해합_2231;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int result = 0;

        //1~N까지의 수를 다 돌려본다.
        for(int i = 1; i<=N; i++){
            int num = i;
            int sum = 0;

            //num 숫자의 자릿수를 더해준다.
            while(num>0){
                sum += num % 10;
                num /= 10;
            }

            //i의 자릿수를 모두 더한 수(sum) + i 가 N이면 생성자이므로 반복 종료.
            if(sum + i == N) {
                result = i;
                break;
            }
        }
        System.out.println(result);
        br.close();
    }
}
