package 점근적_표기1_24313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a0 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        int f = a1*n0+a0;
        int g = c * n0;

        //a0이 음수일 경우도 고려해주어야 한다.
        //a1이 c와 같거나 작아야 한다.
        if(f <= g && c >= a1){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        br.close();
    }
}
