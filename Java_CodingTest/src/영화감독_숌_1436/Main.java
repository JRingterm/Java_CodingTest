package 영화감독_숌_1436;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int num = 666;

        //불필요한 String 객체 생성 최소화 버전.
        //N<17을 따로 뺀다고 해서 속도차이 크게 안난다.
        while(true) {
            if(String.valueOf(num).contains("666")){
                count++;
                if(count == N){
                    System.out.println(num);
                    break;
                }
            }
            num++;
        }
        /* 메모리 초과로 인해 실패. 문자열 변환 연산의 반복으로 인해 메모리 초과.
        int series = 16660;
        int count = 17;

        //16번째 까지는 (N-1)666 패턴.
        if(N<17){
            String s = Integer.toString(N-1);
            System.out.println(s + "666");
            return;
        }
        else { //17번째 부터는 패턴이 달라진다.
            while (true) { //시리즈 번호를 1씩 늘려가며 666이 포함되는지, 순서가 맞는지 확인.
                String s = Long.toString(series);
                if (s.contains("666") && count == N) {
                    System.out.println(s);
                    break;
                }
                count++;
                series++;
            }
        }
        */
        br.close();
    }
}
