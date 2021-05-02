import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<ArrayList> res = new ArrayList<>();
        List ans = new ArrayList();
        char[] chars = s.toCharArray();
        for (char cc : chars) {
            ans.add(cc);
        }
        int n = s.length();
        ree(n, ans, res, 0);
        ArrayList arr=new ArrayList(ans.size());
        for(int i=0;i<res.size();i++){
            StringBuilder ss=new StringBuilder();
            for (int j = 0; j< res.get(j).size(); i++){
                ss.append(res.get(i).get(j));
                arr.add(ss);
            }
        }
        System.out.println(arr);
    }

    public static void ree(int length, List ans, List<ArrayList> res, int b){
        if (b == length) res.add(new ArrayList(ans));
        for (int i = b; i < length; i++) {
            Collections.swap(ans, b, i);
            ree(length, ans, res, b + 1);
            Collections.swap(ans, b, i);
        }

    }


}
