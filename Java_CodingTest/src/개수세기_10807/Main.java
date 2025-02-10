package 개수세기_10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //Scanner보다 더 빠른 BufferedReader를 사용한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader는 String으로만 받아지므로, 정수를 받고싶으면 형변환 해주어야 한다.
        int N = Integer.parseInt(br.readLine());

        //공백으로 나뉜 스트링 입력을 받을 때에는 StringTokenizer로 토큰별로 받는다.
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int v = Integer.parseInt(br.readLine());
        int count = Collections.frequency(list, v);
        System.out.println(count);

        br.close();
    }
}
