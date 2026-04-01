package 대칭_차집합_1269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int countA, countB;
        countA = Integer.parseInt(st.nextToken());
        countB = Integer.parseInt(st.nextToken());

        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            A.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            B.add(Integer.parseInt(st.nextToken()));
        }

        Set<Integer> subtAB = new HashSet<>(A);
        Set<Integer> subtBA = new HashSet<>(B);
        //A-B
        subtAB.removeAll(B);
        //B-A
        subtBA.removeAll(A);

        int count = subtBA.size() + subtAB.size();
        System.out.println(count);

        br.close();
    }
}
