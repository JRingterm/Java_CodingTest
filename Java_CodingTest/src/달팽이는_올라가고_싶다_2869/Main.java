package 달팽이는_올라가고_싶다_2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        //int sum = 0, count = 0;

        //낮에 정상에 도착하면 끝. (A-B) = 하루에 움직이는 높이, (V-A) = 정상에 도달하기 전날까지 필요한 높이.
        // (V-A) / (A-B) = 정상에 도달하기 전날까지 필요한 일 수.
        if((V-A) % (A-B) != 0)
            System.out.println((V-A) / (A-B) + 2);
        else
            System.out.println((V-A) / (A-B) + 1); //낮에 정상에 도착하면 끝.

//        시간초과
//        while(true){
//            sum += A;
//            count += 1;
//            if(V<=sum){
//                System.out.println(count);
//                break;
//            }
//            sum -= B;
//        }
    }
}
