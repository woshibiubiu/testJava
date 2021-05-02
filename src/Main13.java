import java.util.Scanner;

/**
 * @date 2021/4/14 10:42
 */
public class Main13 {
    public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
        //int a=sc.nextInt();
        int a=40;
        int b = 0;
        for(int i=0;i<=a;i++){
            if(i!=0 ) {
                if(i%10==2 || i%10== 0 || i%10== 1 || i%10== 9) {
                    b=b+i;
                    i=0;
                }
                i/=10;
            }
        }
        System.out.println(b);
        }
    }

