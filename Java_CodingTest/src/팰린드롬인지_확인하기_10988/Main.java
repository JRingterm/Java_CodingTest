package 팰린드롬인지_확인하기_10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        String word = br.readLine();
        String reversed = new StringBuilder(word).reverse().toString();

        if(word.equals(reversed)){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
        br.close();
        */
        //라이브러리 안쓰기
        char[] word = br.readLine().toCharArray();
        int left = 0;
        int right = word.length-1;
        boolean result = true;

        while(left < right){
            if (word[left] != word[right]){
                result = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(result ? 1 : 0);
        br.close();
    }
}
