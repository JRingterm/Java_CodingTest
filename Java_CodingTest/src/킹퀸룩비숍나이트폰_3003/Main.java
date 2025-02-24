package 킹퀸룩비숍나이트폰_3003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] basic = {1,1,2,2,2,8};

        int [] input = new int[6];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 6; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        int [] calc = new int[6];
        for(int i = 0; i<6; i++){
            calc[i] = basic[i] - input[i];
        }

        String result = Integer.toString(calc[0]);
        for(int i = 1; i<6; i++){
            result += " " + calc[i];
        }
        System.out.println(result);
        */

        //개선 버전
        int [] basic = {1,1,2,2,2,8};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 6; i++){
            System.out.print(basic[i] - Integer.parseInt(st.nextToken()));
            System.out.print(" ");
        }
        br.close();
    }
}
