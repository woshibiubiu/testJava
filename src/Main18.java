/**1 1 1 0 1 0 1 0 1
 * @date 2021/4/29 17:13
 */
public class Main18 {
    public static void main(String[] args) {
            int [][] arr=new int[3][3];
            arr[0][0]=1;
            arr[0][1]=1;
            arr[0][2]=1;
            //arr[0][3]=0;
            arr[1][0]=1;
            arr[1][1]=1;
            arr[1][2]=1;
            //arr[1][3]=1;
            arr[2][0]=1;
            arr[2][1]=1;
            arr[2][2]=1;
            //arr[2][3]=1;
//            arr[3][0]=1;
//            arr[3][1]=0;
//            arr[3][2]=1;
//            arr[3][3]=0;
            //arr[0][0]=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("-----------------");
        int[][] ints = reseverSum(arr);

        for(int i=0;i<ints.length;i++){
            for(int j=0;j<ints[0].length;j++){
                if(ints[i][j] ==0){
                    ints[i][j] =1;
                }else {
                    ints[i][j]=0;
                }
                System.out.print(ints[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static int[][] reseverSum(int [][] num){
        int a=num.length;int b=num[0].length;
        for(int i=0;i<a;i++){
            int c=0;int d=b-1;
            for(int j=0;j<b-1;j=j+2){

                    int count=num[i][c];
                    num[i][c] =num[i][d];
                    num[i][d] =count;

               c++;d--;
            }
        }

        return num;
    }
}
