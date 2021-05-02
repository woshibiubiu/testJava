import java.util.Scanner;

/**
 * @date 2021/3/31 14:29
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i = sc.nextInt();
        int [] res =new int [i];
        for(int a=0;a<i;a++){
            res[a] =sc.nextInt();
        }
        for(int b:res){
            System.out.println(b);
        }
    }
}
