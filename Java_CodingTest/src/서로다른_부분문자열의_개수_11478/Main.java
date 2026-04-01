package 서로다른_부분문자열의_개수_11478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        Set<String> set = new HashSet<>();

        //하나하나 더해서 set에 넣어주기.
        for(int i = 0; i<S.length(); i++){
            for(int j = 0; j<S.length()-i; j++){
                set.add(S.substring(j, j+i+1));
            }
        }
        System.out.println(set.size());
    }
}
