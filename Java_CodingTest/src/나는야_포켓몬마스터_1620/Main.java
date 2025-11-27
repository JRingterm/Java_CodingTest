package 나는야_포켓몬마스터_1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //양방향 맵 보다는, 이름을 따로 저장해놓고, 이름을 key로 하는 맵 구성.
        String[] names = new String[N+1];
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 1; i<=N; i++){
            String name = br.readLine();
            names[i] = name;
            map.put(name, i);
        }

        for(int i = 0; i<M; i++){
            String input = br.readLine();
            boolean isInt = input.matches("-?\\d+"); //정수 형식인가?
            if(isInt){//정수이면
                int num = Integer.parseInt(input);
                System.out.println(names[num]);
            }
            else{
                System.out.println(map.get(input));
            }
        }
        br.close();
    }
}
