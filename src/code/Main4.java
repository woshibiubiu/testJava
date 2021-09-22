package code;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author biubiu
 * @Date 2021/9/15 17:27
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int a=sc.nextInt();
        String[] split = s.split(",");
        int[] res=new int[split.length];
        int len =res.length;
        for(int i=0;i<len;i++){
            res[i]=Integer.valueOf(split[i]);
        }

        int[] dp=new int[a+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int r:res){
            for(int i=r;i<=a;i++){
                if(dp[i-r]==Integer.MAX_VALUE){
                    continue;
                }else{
                    dp[i]=Math.min(dp[i],dp[i-r]+1);
                }
            }
        }
        System.out.println(dp[a]);
    }


}
