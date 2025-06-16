package 네_번째_점_3009;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> x = new ArrayList<Integer>();
        List<Integer> y = new ArrayList<Integer>();

        int resultx = 0;
        int resulty = 0;

        for(int i = 0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x.add(Integer.parseInt(st.nextToken()));
            y.add(Integer.parseInt(st.nextToken()));
        }
        //중복값 개수 세서, 3개 또는 1개라면, 그 값이 필요한 점의 좌표.
        for(int i = 0; i<3; i++){
            if(Collections.frequency(x,x.get(i)) == 3 || Collections.frequency(x,x.get(i)) == 1){
                resultx = x.get(i);
            }
            if(Collections.frequency(y,y.get(i)) == 3 || Collections.frequency(y,y.get(i)) == 1){
                resulty = y.get(i);
            }
        }
        System.out.println(resultx + " " + resulty);
        br.close();
        //위 처럼 계산하는 것 보다, if문 돌려서 값 비교해서 찾는게 메모리, 시간 더 적게 먹음.
    }
}
