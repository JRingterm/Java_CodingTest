package 단어공부_1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String trans = word.toUpperCase();

        int [] count = new int[26];

        for(int i = 0; i<trans.length(); i++){
            char ch = trans.charAt(i);
            count[ch - 'A']++;
        }
        int max = 0;
        char alpha = ' ';

        for(int i = 0; i<26; i++){
            if(count[i]>max){
                max = count[i];
            }
        }

        int maxCount = 0;
        for(int i = 0; i<26; i++){
            if(count[i] == max){
                maxCount++;
                alpha = (char)(i + 'A');
            }
        }
        if(maxCount != 1){
            System.out.println('?');
        }
        else{
            System.out.println(alpha);
        }
        br.close();
    }
}
