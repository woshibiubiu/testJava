package code;

import java.util.*;

/**
 * @Author biubiu
 * @Date 2021/9/8 10:26
 */
public class StackOfPlates {
    static List<Stack> list =new ArrayList<Stack>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

            TreeSet<Integer> set=new TreeSet<Integer>();
            int n=sc.nextInt();
            if(n>0){
                for(int i=0;i<n;i++){
                    set.add(sc.nextInt());
                }
            }
            for(Integer i:set){
                System.out.println(i);
            }
        }
    }
    public int solve (int[] a) {
        // write code here
        for(int i=0;i<a.length;i++){

        }
            return 0;
    }
    //import java.util.*;
    //public class Main {
    //        public static void main(String[] args){
    //            Scanner sc = new Scanner(System.in);
    //            while(!sc.hasNext("0")){
    //                int n = sc.nextInt();
    //                int count = 0;
    //                while(n/3>0){
    //                    count+=n/3;
    //                    n=n/3+n%3;
    //                    if(n==2){
    //                        n=n+1;
    //                    }
    //                }
    //                System.out.println(count);
    //            }
    //        }
    //}
}
