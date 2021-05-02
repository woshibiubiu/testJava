import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @date 2021/3/13 15:58
 */
public class test03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        ArrayList ad = dfs(s);
        System.out.println(ad);
    }
    public static  ArrayList dfs(String s){
        ArrayList arr=new ArrayList();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
           int a= s.charAt(i);
            System.out.println(a);
           if(a>'9'){
               arr.add(sb);
               sb=new StringBuilder();
               continue;
           }
           sb.append(Integer.valueOf(a));

        }

        return arr;
    }

}
