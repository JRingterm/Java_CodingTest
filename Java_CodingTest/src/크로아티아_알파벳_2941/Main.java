package 크로아티아_알파벳_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String [] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        //문자열에 크로아티아 알파벳을 포함하고 있다면, 다른 문자로 대체한다.
        for(int i = 0; i<croatia.length; i++){
            if(input.contains(croatia[i])){
                input = input.replace(croatia[i], "a");
            }
        }
        System.out.println(input.length());
    }
}
