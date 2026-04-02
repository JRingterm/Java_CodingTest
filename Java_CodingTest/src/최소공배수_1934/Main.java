package 최소공배수_1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            System.out.println(lcm(A,B));
        }
        br.close();
    }
    //최대공약수 구하기
    public static int gcd(int a, int b){
        if (b==0) return a;
        return gcd(b,a%b);
    }
    //최소공배수 구하기
    public static int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }
}
