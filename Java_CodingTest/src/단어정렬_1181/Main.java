package 단어정렬_1181;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //중복 제거를 위해 Set에 입력받기
        Set<String> words = new HashSet<>();
        for(int i = 0; i<N; i++){
            words.add(br.readLine());
        }
        //정렬을 위해 Set -> List 변환
        List<String> words_list = new ArrayList<>(words);
        words_list.sort(Comparator.comparingInt(String::length) //글자수 기준 오름차순
                .thenComparing(Comparator.naturalOrder())); //길이 같다면, 사전순

         for(String word : words_list){
             System.out.println(word);
         }
         br.close();
    }
}
