import java.util.Scanner;

/**
 * @date 2021/3/31 19:11
 */
public class Main8 {
    static  int a=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        System.out.println(ree(s,s1))  ;
    }

    public static boolean ree(String s,String s1){
        char [] dp =new char[s1.length()+s.length()];
        if(s.length() !=s1.length()) return false;
        char[] chars = s.toCharArray();
        char[] chars1 = s1.toCharArray();
        for(int i=0;i<s.length();i++){
            if(chars[i] == chars1[i]) continue;
            dp[a]=chars[i];a++;
            dp[a] =chars[i];a++;
        }
        if(a!=4) return false;
        if(dp[0] ==dp[3] &&dp[1]==dp[2]) return true;
        return  true;
    }
}
