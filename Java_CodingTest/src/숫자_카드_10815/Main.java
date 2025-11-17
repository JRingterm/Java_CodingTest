package 숫자_카드_10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Set<Integer> cards = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            cards.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++){
            //Array에서의 contains() 시간복잡도는 O(n), Set에서의 contains()는 O(1)이다.
            //Array는 요소를 전부 순회하며 찾지만, Set은 내부적으로 해시테이블을 사용하기 때문.
            if(cards.contains(Integer.parseInt(st2.nextToken()))){
                list.add(1);
            }
            else{
                list.add(0);
            }
        }
        for (int x : list){
            System.out.print(x + " ");
        }
        br.close();
    }
}
