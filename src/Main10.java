import java.util.ArrayList;
import java.util.List;

/**
 * @date 2021/4/1 15:52
 */
public class Main10 {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        //String s="A";
        list.add("A");
        list.add("B");
        System.out.println(list);
        for(String aa:list){
            if(aa =="A") continue;
            System.out.println(aa);
        }
    }
    public int maxSubArray(int[] nums) {
        int []dp =new int[nums.length];
        int min=-100;
        dp[0]=nums[0]<0?0:nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }
}
