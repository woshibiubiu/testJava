package code;

import java.util.Scanner;

/**
 * @Author biubiu
 * @Date 2021/9/15 16:51
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] chars = s.toCharArray();
        int[] res =new int[chars.length];
        int j=0;
        for(int i=0;i<chars.length;i++){
            if (0<=Integer.valueOf(chars[i])-48&&Integer.valueOf(chars[i])-48<=9){
                res[j]=Integer.valueOf(chars[i])-48;
                j++;
            }
        }
        if(j<3){
            System.out.println(-1);
        }else{
            System.out.println(res[3]);

        }

    }
}
