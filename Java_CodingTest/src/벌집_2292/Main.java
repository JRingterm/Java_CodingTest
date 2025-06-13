package 벌집_2292;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int step = 1; //벌집 한겹에서의 최대 번호
        int count = 1; //N까지 도달하기 위한 방의 수

        while(true){
            step += 6*(count-1);
            if(N<=step){
                System.out.println(count);
                break;
            }
            count += 1;
        }
        br.close();
    }
}
