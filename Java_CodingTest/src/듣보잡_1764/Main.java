package 듣보잡_1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> names = new HashSet<>();
        Set<String> result = new HashSet<>();

        for(int i = 0; i<N; i++){
            names.add(br.readLine());
        }
        for(int i = 0; i<M; i++){
            String name = br.readLine();
            if(names.contains(name)){
                result.add(name);
            }
        }

        System.out.println(result.size());
        //애초에 HashSet이 아니라 TreeSet으로 만들었다면, 자동 정렬된다. HashSet은 리스트로 변환 후 정렬.
        List<String> list = new ArrayList<>(result);
        Collections.sort(list);

        for(String s : list){
            System.out.println(s);
        }
        br.close();
    }
}
