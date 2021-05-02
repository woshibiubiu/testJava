import java.util.HashSet;
import java.util.Set;

/**
 * @date 2021/4/28 12:02
 */
public class Offer1 {
    public static void main(String[] args) {

    }
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set =new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return 0;
    }
}
