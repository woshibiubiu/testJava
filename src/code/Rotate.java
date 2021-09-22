package code;

/**
 * @Author biubiu
 * @Date 2021/8/29 22:19
 */
public class Rotate {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] matrix_new = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix_new[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = matrix_new[i][j];
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(matrix[i][j] == 0){
                    row[i] =row[j] =true;
                }
            }
        }
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(row[i]||col[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }

    public static boolean isFlipedString(String s1, String s2) {
        ThreadLocal<String> localVar = new ThreadLocal<>();

        int len = s1.length();
        int len2 = s2.length();
        if (len != len) {
            return false;
        }
        int size = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len2; j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    size = j;
                    continue;
                }else {
                    i =0;
                    j = size+1;
                }

            }

        }

        return true;
    }
}
