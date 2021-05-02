/**
 * @date 2021/4/14 10:27
 */
public class Main12 {
    public static void main(String[] args) {
        int [] a=new int[5];
        a[0]=1;a[1]=1;a[2]=1;
        for(int i=3;i<5;i++){
            a[i]=a[i-1]+a[i-2]+a[i-3];
        }
        System.out.println(a[4]);
    }
}
