package 그룹_단어_체커_1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = N;

        for(int i = 0; i<N; i++){
            String input = br.readLine();
            int [] check = new int[26]; //알파벳 배열 초기화

            for(int j = 0; j<input.length(); j++){
                int now_alpha = input.charAt(j); //현재 알파벳 저장
                if(j == 0) { //첫번째 글자라면,
                    check[now_alpha - 'a'] = 1; //무조건 체크
                }
                else{ //첫번째 글자가 아니면
                    if(now_alpha != input.charAt(j-1)){ //앞 글자랑 다르면
                        if(check[now_alpha-'a'] == 0){ //처음 나온 글자라면
                            check[now_alpha-'a'] = 1; //체크
                        }
                        else{ //앞 글자랑 다른데, 처음 나온 글자가 아니라면
                            count -= 1; //그룹 단어가 아닌 것이므로 -1
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
        br.close();
    }
}
