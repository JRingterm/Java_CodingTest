package 설탕_배달_2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while(N > 0){
            if(N % 5 == 0){ //큰 수로 나누어지면 출력
                count += N/5;
                System.out.println(count);
                return;
            }
            if(N < 3){ //작은 수보다 작으면 만들 수 없으므로 -1 출력
                System.out.println("-1");
                return;
            }
            //작은 수를 하나씩 선택해가면서 반복문 돌기.
            N -= 3;
            count++;
        }
        System.out.println(count);
        br.close();
    }
}
