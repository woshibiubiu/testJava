package code;

import java.util.Scanner;

/**
 * @Author biubiu
 * @Date 2021/9/13 15:59
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] split = s.split(",");
        int max=0;
        int res=0;
        int[] dp=new int[split.length];
        for(int i=0;i< split.length;i++){
            if(split[i].equals("0")){
                res++;
                continue;
            }else{
                max=Math.max(res,max);
                res=0;
            }
        }
        if(split[0].equals("0")){
            System.out.println(max);
        }else if(split[split.length-1].equals("0")){
            System.out.println(max);
        }else {
            System.out.println(max/2);
        }
        //System.out.println(max);
    }
}
