package 나이순_정렬_10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //Collections.sort()를 사용하기 위해 이차원 배열을 List로 만듦.
        //String[][] people = new String[N][2];
        List<String[]> people = new ArrayList<>();

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            people.add(new String[]{st.nextToken(), st.nextToken()});
        }
        //Arrays.sort()로 하면, 나이가 같을 경우, 입력한 순서대로 나오는걸 보장하지 않는다.
        //Collections.sort()는 TimSort로, 안정 정렬이다.
        Collections.sort(people, (a,b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));

        for(String[] s : people){
            System.out.println(s[0] + " " + s[1]);
        }
        br.close();
    }
}
