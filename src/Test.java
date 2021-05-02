/**
 * @date 2021/3/6 19:56
 */


    class Test {
        public int countSubstrings(String s) {
            boolean [][]  dp = new boolean [s.length()][s.length()];
            char [] chars =s.toCharArray();
            int res =0;
            for(int i = 0;i<s.length();i ++){
                for(int j=0;j<=i;j++){
                    if(chars[i] == chars[j] && (i - j <2 || dp[j+1][i-1])){
                         dp[j][i] =true;
                        System.out.println("shuchu "+ chars[i] + ","+ chars[j]);
                        res++;
                    }
                }
            }
            return res;

        }




    public static void main(String[] args) {
            Test test =new Test();
            String s="abc";
        int i = test.countSubstrings(s);
        System.out.println(i);

    }
}
