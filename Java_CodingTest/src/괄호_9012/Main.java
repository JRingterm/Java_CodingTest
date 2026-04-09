package 괄호_9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i<T; i++){
            String s = br.readLine();
            Deque<String> stack = new ArrayDeque<>();
            for(int j = 0; j<s.length(); j++){
                String ch = s.substring(j, j+1);
                if(ch.equals("("))
                    stack.push(ch);
                else if(ch.equals(")")) {
                    if (stack.isEmpty()) {
                        stack.push(ch);
                        break;
                    } else
                        stack.pop();
                }
            }
            if(stack.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
