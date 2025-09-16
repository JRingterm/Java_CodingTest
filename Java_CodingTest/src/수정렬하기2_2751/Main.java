package 수정렬하기2_2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];

        for(int i = 0; i<N; i++){
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);
        for(int i=0; i<N; i++){
            System.out.println(num[i]);
        }
        br.close();
        //너무 쉽게 풀어서 검색해보니, 원래는 Arrays.sort를 쓰면 시간초과가 난다고 함.
        //Arrays.sort의 경우 dual-pivot Quicksort 알고리즘을 사용하는데,
        //평균 시간복잡도가 O(nlogn)이고, 최악의 경우 시간복잡도는 O(n^2)이다.
        //따라서 최악의 경우에도 O(nlogn)을 보장하는 정렬 알고리즘을 사용해야한다.
        //그 방법으로는 Collections.sort()인데, 이게 Timsort(팀정렬)를 사용한다.
        //어려운 알고리즘이라 지금은 언어에 내장된 정렬함수를 쓰는것을 권장한다고 한다.
    }
}
