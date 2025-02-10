package 별찍기7_2444;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //System.out 대신에 더 빠른 BufferedWriter 사용.
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i < N+1; i++){
            for(int j = 0; j < N-i; j++){
                //System.out.print(' ');
                bw.write(' ');
            }
            for(int k = 0; k < i*2-1; k++){
                //System.out.print('*');
                bw.write('*');
            }
            //System.out.println();
            bw.newLine();
        }

        for(int i = N-1; i >= 0; i--){
            for(int j = 0; j < N-i; j++){
                //System.out.print(' ');
                bw.write(' ');
            }
            for(int k = 0; k < i*2-1; k++){
                //System.out.print('*');
                bw.write('*');
            }
            //System.out.println();
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
