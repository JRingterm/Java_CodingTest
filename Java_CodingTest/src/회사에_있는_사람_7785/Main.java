package 회사에_있는_사람_7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<String> s = new HashSet<String>();
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String state = st.nextToken();
            if(state.equals("enter")){
                s.add(name);
            }
            else if(state.equals("leave")){
                s.remove(name);
            }
        }
        //UnsupportedOperationException 발생!
        //s.stream().toList()가 반환하는 리스트는 불변 리스트이기 때문!
        /*
        List<String> list = s.stream().toList();
        Collections.sort(list, Comparator.reverseOrder());
        */
        List<String> list = new ArrayList<>(s);
        Collections.sort(list, Comparator.reverseOrder());

        for(String a : list){
            System.out.println(a);
        }
        br.close();
    }
}
