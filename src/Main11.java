import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @date 2021/4/8 19:18
 */
public class Main11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int V = sc.nextInt();
        int[][] bag = new int[N][3];
        for(int i =0; i < N; i++){
            bag[i][0] = sc.nextInt();
            bag[i][1] = sc.nextInt();
            bag[i][2] = sc.nextInt();
        }

//        long[][] dp = new long[N+1][V+1];
//        for(int i = 0 ; i <dp.length; i++){
//            for(int k = 0 ; k <dp[0].length; k++){
//                dp[i][k] = -1;
//            }
//        }

        for(int i = 0 ; i <bag.length; i++){
            System.out.print(bag[i][0]);
            System.out.print(" ");
            System.out.print(bag[i][1]);
            System.out.print(" ");
            System.out.print(bag[i][2]);
            System.out.println();
        }

        System.out.println(process(N, V, bag, 0));
    }

    public static long process(int N, int V, int[][] bag, int index){
        // if(dp[index][V] != -1){
        //     return dp[index][V];
        // }

        // if(index == N || V <= 0){
        //   dp[index][V] = 0;
        //     return 0;
        // }


        // long max = 0;
        // for(int i = 0; i <= bag[index][2]; i++){
        //     if(V-bag[index][0]*i >= 0){
        //         max = Math.max(max, process(N, V-bag[index][0]*i, bag, index+1, dp)+bag[index][1]*i);
        //     }else{
        //         break;
        //     }
        // }

        // dp[index][V] = max;
        // return max;


        // long[][] dp = new long[N+1][V+1];
        // for(int i = 0 ; i <dp.length; i++){
        //     for(int k = 0 ; k <dp[0].length; k++){
        //         dp[i][k] = -1;
        //     }
        // }

        // for(int i = 0; i <V+1; i++){
        //     dp[N][i] = 0;
        // }
        // for(int i = 0; i <= N; i++){
        //     dp[i][V] = 0;
        // }
        // for(int i = N-1; i >= 0; i--){
        //     for(int k = 1; k <= V; k++){
        //         for(int m = 0; m <= bag[index][2]; m++){
        //             if(k-bag[i][0]*m >= 0){
        //                 dp[i][k] = Math.max(dp[i][k], dp[i+1][k-bag[i][0]*m]+bag[index][1]*i);
        //             }else{
        //                 break;
        //             }
        //         }
        //     }
        // }

        // long rt = 0;
        // for(int i = V; i >= 0; i--){
        //     if(dp[N-1][i] != -1){
        //         rt = dp[N-1][i];
        //         break;
        //     }
        // }

        // return rt;

        long[][] dp = new long[N][V+1];
        for(int i = 1; i <= V ; i++){
            for(int k = 0; k <= bag[0][2]; k++){
                if(bag[0][0] * k <= i){
                    dp[0][i] = bag[0][0] * k;
                }
            }
        }

        for(int i = 1; i < N; i++){
            for(int j = 1; j <= V; j++){
                dp[i][j] = dp[i][j-1];
                for(int k = 0; k <= bag[i][2]; k++){
                    if(j - bag[i][0] * k >= 0){
                        dp[i][j] = Math.max(dp[i][j], dp[i-1][j - bag[i][0] *k] + bag[i][1] * k);
                    }else{
                        break;
                    }
                }
            }
        }

        for(int i = 0 ; i < dp.length; i++){
            for(int k = 0; k < dp[0].length; k++){
                System.out.print(dp[i][k]);
                System.out.print(" ");
            }
            System.out.println();
        }

        long rt = 0;
        for(int i = V; i >= 0; i--){
            rt = Math.max(rt, dp[N-1][i]);
        }

        return rt;
    }



}