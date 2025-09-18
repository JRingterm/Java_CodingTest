package 좌표_정렬하기_11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [][] coordinate = new int[N][2];

        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordinate[i][0] = Integer.parseInt(st.nextToken());
            coordinate[i][1] = Integer.parseInt(st.nextToken());
        }
        //이차원 배열에서 한 행씩 비교.
        //compare(a,b)는 a<b이면 음수 반환, a==b이면 0반환, a>b이면 양수 반환
        Arrays.sort(coordinate, (a,b) -> {
            int cmp = Integer.compare(a[0], b[0]);   //x값 기준으로 비교
            if(cmp != 0)                        //x값이 다르면, 정렬 확정
                return cmp;
            return Integer.compare(a[1], b[1]); //x값이 같으면, y값으로 정렬
        });

        for(int[] result : coordinate){
            System.out.println(result[0] + " " + result[1]);
        }
        br.close();
    }
}
