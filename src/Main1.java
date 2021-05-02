import java.util.Scanner;

/**
 * @date 2021/3/20 19:16
 *
 * 时间限制： 3000MS
 * 内存限制： 589824KB
 * 题目描述：
 * 给一个字符串s，你可以至多选择两个不同位置的字符进行交换（可以选择不交换，保留原串），问所有可能中字典序最小的串。
 *
 * 有关字典序：对于长度相同的串a和串b，串a的字典序小于串b当且仅当存在一个位置i使得串a和串b的前i-1个字符完全相同且串a的第i个字符小于串b的第i个字符。即a1=b1,a2=b2,...ai-1=bi-1且ai<bi。
 *
 *
 *
 * 输入描述
 * 一行一个字符串s，保证串中都为小写字母('a'~'z')。字符串长度<=200000
 *
 * 输出描述
 * 输出一个串t，表示所有可能中字典序最小的串。
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        String s = src.nextLine();
        String s1 = sub(s);
        System.out.println(s1);
    }

    public static  String sub(String s){
        char min;
        int a =0;int b=0;
        boolean state =true;
        char [] chars =s.toCharArray();
         min=chars[0];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<chars.length;i++){
            if(chars[i] <= min){
                min =chars[i];
                 a=i;
            }
        }
//        for(int i =0;i<=chars.length;i++){
//            for(int j=i+1;j<chars.length;j++){
//
//                if(chars[i] >chars[j]){
//                   // min =chars[j];
//                    b=i;
//                    a=j;
//                    i =chars.length;
//                    break;
//                }
//            }
//        }
        char re =chars[0];
        chars[0] =chars[a];
        chars[a] =re;
        for(int i=0;i<chars.length;i++){
            sb.append(chars[i]);
        }
        return sb.toString();
    }
}
