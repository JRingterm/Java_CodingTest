package 너의_평점은_25206;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Float> score = new HashMap<>(); //점수 계산을 위한 Key,Value 해시맵
        score.put("A+", 4.5F);
        score.put("A0", 4.0F);
        score.put("B+", 3.5F);
        score.put("B0", 3.0F);
        score.put("C+", 2.5F);
        score.put("C0", 2.0F);
        score.put("D+", 1.5F);
        score.put("D0", 1.0F);
        score.put("F", 0.0F);

        //2x20 배열 만들기
        String[][] gradeList = new String[20][2];

        //학점, 등급 입력받기
        for(int i = 0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken(); //과목명 무시
            gradeList[i][0] = st.nextToken(); //학점
            gradeList[i][1] = st.nextToken(); //등급
        }

        float creditSum = 0.0F; //학점의 합
        float gradeSum = 0.0F; //학점 * 등급의 합
        //평점 계산하기
        for(int i = 0; i<20; i++){
            if(gradeList[i][1].equals("P")){
                continue;
            }
            creditSum += Float.parseFloat(gradeList[i][0]);
            gradeSum += score.get(gradeList[i][1]) * Float.parseFloat(gradeList[i][0]);
        }
        float result = gradeSum/creditSum;

        //소수점 6자리까지
        System.out.printf("%.6f", result);
        br.close();
    }
}
