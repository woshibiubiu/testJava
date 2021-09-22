package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @Author biubiu
 * @Date 2021/9/11 17:51
 */
public class HwOdTest {
        public static int mokeyJump(int m){
            if(m<=3){
                return m==3?2:1;
            }
            int[] res=new int[m+1];
            res[0]=1;
            res[1]=1;
            res[2]=1;
            res[3]=2;
            for(int a=4;a<=m;a++){
                res[a]=res[a-1]+res[a-3];
            }
            return res[m];
        }

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String first;
        while (null!=(first=buff.readLine())){
            int n = Integer.parseInt(first);
            String[] he = buff.readLine().split(" ");
            String[] kg = buff.readLine().split(" ");
            int[] h = new int[n];
            int[] k = new int[n];
            for(int i=0;i<n;i++){
                h[i]=Integer.parseInt(he[i]);
                k[i]=Integer.parseInt(kg[i]);
            }
            st[] sts = new st[n];
            for(int i=0;i<n;i++){
                sts[i]=new st(i+1,h[i],k[i]  );
            }
            Arrays.sort(sts, new Comparator<st>() {
                @Override
                public int compare(st o1, st o2) {
                    if(o1.h==o2.h) {
                        return o1.k-o2.k;
                    } else{
                        return o1.h-o2.h;
                    }
                }
            });

            for (st s:sts) {
                System.out.print(s.n+" ");
            }

        }
    }

}
class st{
    int n;
    int h;
    int k;
    st(int n, int h, int k  ){
        this.n=n;
        this.h=h;
        this.k=k;
    }

}
