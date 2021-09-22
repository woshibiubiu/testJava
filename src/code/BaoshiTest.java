package code;

import java.util.Scanner;

/**
 * @Author biubiu
 * @Date 2021/9/11 20:39
 */
public class BaoshiTest {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //int a =Integer.valueOf(scanner.nextLine()) ;
        int a =scanner.nextInt() ;
        while(a-->0){
            String s=scanner.next();
            //System.out.println(s+" 1111");
            int length =s.length();
            int sum =0;
            for(int i=0;i<length;i++){
                sum+=Integer.valueOf(s.charAt(i))-64;
            }
            System.out.println(sum);
            //System.out.println(1111111111);
        }
    }
}
