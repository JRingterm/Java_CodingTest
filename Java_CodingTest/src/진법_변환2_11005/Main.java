package 진법_변환2_11005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        String s = "";
        while(B <= N){
            int mod = 0;
            mod = N % B;
            if(10 <= mod && mod <= 35){
                s = (char)(mod + 55) + s;
            }
            else
                s = mod + s;

            N /= B;
        }
        if(N!=0)
            if(10 <= N && N <= 35){
                s = (char)(N + 55) + s;
            }
            else
                s = N + s;
        System.out.println(s);
    }
}
/* Integer.toString(N,B)는 10진수 N을 B진수 문자열로 변환하는 메소드이다.
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(Integer.toString(N, B).toUpperCase());
    }
}
 */
