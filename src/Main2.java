import java.util.Scanner;

/**
 * @date 2021/3/27 19:20
 * 题目描述：
 * 小明最近在学习《有机化学》。在化学中，有机化合物简称为有机物，是指含碳元素的化合物，其组成元素除碳外，通常还含有氢、氧、氮、硫、磷、卤素等元素。
 *
 * 小明想写个小程序来计算简单有机化合物的分子量（相对分子量），假设需要计算分子量的有机物中只包含C、H、O、N四种元素，其相对原子质量分别如下：
 *
 * C: 12，H: 1，O：16，N: 14。
 *
 * 例如某有机物的分子式为：C4H9OH，其相对分子量为12*4+1*9+16+1 = 74。
 *
 * 请你帮他实现这个计算相对分子量的程序。
 *
 *
 *
 * 输入描述
 * 单组输入。
 *
 * 输入一行，包含一个只包含字母C、H、O、N和数字的分子式，如果字母后面没有数字则表示该原子只出现1次。在一个分子式中，允许一个元素在不同位置出现多次。分子式的长度不超过100个字符。
 *
 * 输出描述
 * 输出一个正整数，即计算所得的相对分子量。
 *
 *
 * 样例输入
 * C4H9OH
 * 样例输出
 * 74
 */
public class Main2 {
    public static void main(String[] args) {
        int count =0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int sss = resum(s, count);
        System.out.println(sss);
    }
    public static int resum(String s ,int count){
       ;
        char [] chars =s.toCharArray();
        //System.out.println(chars);
        int len =chars.length;
        System.out.println(len);
        for(int i=0;i<len-1;i++){
            if(chars[i] =='N'&&chars[i+1]>'9'){
                System.out.println(chars[i]);
                count +=14;
                i++;
            }else if (chars[i] =='N'&&chars[i+1]<'9'){
                int c = Integer.parseInt(String.valueOf(chars[i+1]));
                count +=14*c;

            }else {

            }
            if(chars[i] =='C'&&chars[i+1]>'9'){
                System.out.println(chars[i]);
            count =count +12;
            i++;

            }else if (chars[i] =='C'&&chars[i+1]<'9'){
                int c = Integer.parseInt(String.valueOf(chars[i+1]));
                System.out.println(11111);
                count +=12*c;
            }else {

            }
            if(chars[i] =='H'&&chars[i+1]>'9'){
                System.out.println(chars[i]);

                count +=1;
                i++;

            }else if (chars[i] =='H'&&chars[i+1]<'9'){
                int c = Integer.parseInt(String.valueOf(chars[i+1]));
                count +=1*c;
            }else {

            }
            if(chars[i] =='O'&&chars[i+1]>'9'){
                System.out.println(chars[i]);

                count +=16;
                i++;

            }else if (chars[i] =='H'&&chars[i+1]<'9'){
                System.out.println(222222);
                int c = Integer.parseInt(String.valueOf(chars[i+1]));
                count +=16*c;
            }else {

            }
        }


        return count;
    }
}
