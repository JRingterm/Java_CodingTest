package 숫자_카드2_10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //카드 번호가 key, 개수가 value
        HashMap<Integer, Integer> cards = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            //.merge() : 맵에 key(num)가 없으면, value(1)를 넣는다.
            //만약, key가 있고, value도 있으면, Integer::sum으로 기존값+1을 계산해서 넣는다.
            cards.merge(num, 1, Integer::sum);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] count = new int[M];

        for(int i = 0; i<M; i++){
            //.get()은 맵에 키가 없을 때 null을 반환하기 때문에, null인지 확인하지 않고 바로 언박싱하면 NllPointerException 발생.
            //count[i] = cards.get(Integer.parseInt(st.nextToken()));
            //키가 존재하지 않을 때, 디폴트 값 반환하도록 하여 NullPointerException을 피함.
            count[i] = cards.getOrDefault(Integer.parseInt(st.nextToken()), 0);
        }

        for(int result : count){
            System.out.print(result + " ");
        }
    }
}
