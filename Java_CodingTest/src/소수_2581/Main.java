package 소수_2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int min = 0;
        int sum = 0;

        boolean[] prime_num = makePrimeNum(N);
        for(int i = M; i <= N; i++){
            if(!prime_num[i]){
                if(min == 0){
                    min = i;
                }
                sum += i;
            }
        }
        if(sum == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
        br.close();
    }
    //에라토스테네스의 체 구현 함수 (소수 판별 알고리즘)
    //소수는 약수로 판단하는데, 약수는 해당 수의 제곱근을 기준으로 대칭을 이룬다. (12 = 1,2,3, 4,6,12)
    //따라서, n이 소수임을 판단하기 위해서는 2부터 n의 제곱근까지 나누어 떨어지는지만 확인하면 된다. 시간복잡도 O(루트n)
    //에라토스테네스의 체는 2부터 n의 제곱근까지의 수로 나누어 떨어지면 배열에서 해당 원소는 제거하는 식으로 전개된다.
    //단, 제거할 때, 자기자신은 제외한다. (2로 나누어 떨어질 때, 2를 제외한 2의 배수를 모두 제거.)
    public static boolean[] makePrimeNum(int max) {
        //인덱스 0부터 시작하므로 max+1
        boolean[] prime_num = new boolean[max + 1];

        //0과 1은 소수가 아니므로 true를 주어 체에 걸려졌음을 설정
        prime_num[0] = true;
        prime_num[1] = true;

        //2부터 n의 제곱근까지 나누어 떨어지는지 확인 후 제거
        for (int i = 2; i <= Math.sqrt(max); i++) {
            // 이미 걸러진 배열일 경우 다음 반복문으로 건너뜀
            if(prime_num[i]) {
                continue;
            }
            // 원래는 j = i * 2 부터 시작하는 것이 정석이나,
            // 이미 2의 배수가 false로 걸러졌기 때문에 i의 제곱수부터 시작한다.
            for (int j = i * i; j < max + 1; j = j + i) {
                prime_num[j] = true;
            }
        }
        //소수이면 false
        return prime_num;
    }
}
