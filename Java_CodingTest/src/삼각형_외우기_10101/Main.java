package 삼각형_외우기_10101;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] angle = new int[3];

        for(int i=0; i<3; i++){
            int a = Integer.parseInt(br.readLine());
            angle[i] = a;
        }

        int sum = 0;
        for (int num : angle) {
            sum += num;
        }
        if(sum == 180){
            if(angle[0] == 60 && angle[1] == 60){
                System.out.println("Equilateral");
            } else if (angle[0] == angle[1] || angle[0] == angle[2] || angle[1] == angle[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
        else{
            System.out.println("Error");
        }
        br.close();
    }
}
