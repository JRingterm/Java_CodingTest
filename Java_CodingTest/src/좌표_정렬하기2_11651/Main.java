package 좌표_정렬하기2_11651;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] coordinate = new int[N][2];

        for(int i = 0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            coordinate[i][0] = Integer.parseInt(st.nextToken());
            coordinate[i][1] = Integer.parseInt(st.nextToken());
        }

        //이전 문제와는 반대로, y값을 기준으로 비교하고, 같으면 x값 비교
        Arrays.sort(coordinate, (a,b) -> {
            int cmp = Integer.compare(a[1],b[1]);
            if(cmp != 0)
                return cmp;
            return Integer.compare(a[0],b[0]);
        });
        for(int[] result : coordinate){
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
