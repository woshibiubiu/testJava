/**
 * @date 2021/4/29 17:30
 */
public class Main19 {
    public static void main(String[] args) {
        int [] lne ={1,5,2,2,3,3 };
        for(int i=0;i<lne.length;i++){
            System.out.print(lne[i]);
            System.out.print(" ");
        }
        int findshort = findshort(lne);
        System.out.println("");
        System.out.println(findshort);
    }
    public static int findshort(int[] nums) {
        int max = nums[0];
        int min = nums[nums.length-1];
        int l = 0;
        int r = -106;
        for(int i=0;i<nums.length;i++){
            if(max>nums[i]){
                r = i;
            }else{
                max = nums[i];
            }
            if(min<nums[nums.length-i-1]){
                l = nums.length-i-1;
            }else{
                min = nums[nums.length-i-1];
            }
        }
        if(r==-106) return 0;
        return r-l+1;

    }
}
