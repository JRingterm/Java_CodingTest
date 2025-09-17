package 소트인사이드_1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        char[] chars = N.toCharArray();

        Arrays.sort(chars);

        //문자열 뒤집기
        String desc = new StringBuilder(new String(chars)).reverse().toString();
        System.out.println(desc);
        br.close();
    }
}
