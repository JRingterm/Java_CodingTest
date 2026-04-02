package 스택2_28278;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //Stack 대신 Deque를 많이 쓴다.
        Deque<Integer> stack = new ArrayDeque<>();

        while(N>0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int menu = Integer.parseInt(st.nextToken());
            if(menu == 1){
                stack.push(Integer.parseInt(st.nextToken()));
            }
            if(menu == 2){
                if(stack.isEmpty()){
                    System.out.println(-1);
                }
                else System.out.println(stack.pop());
            }
            else if(menu == 3){
                System.out.println(stack.size());
            }
            else if(menu == 4){
                if(stack.isEmpty())
                    System.out.println(1);
                else System.out.println(0);
            }
            else if(menu == 5){
                if(stack.isEmpty())
                    System.out.println(-1);
                else System.out.println(stack.peek());
            }
            N--;
        }
        br.close();
    }
}
