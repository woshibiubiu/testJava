package code;

import java.util.HashMap;

/**
 * @Author biubiu
 * @Date 2021/9/7 9:43
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        HashMap<ListNode,Integer> hm = new HashMap<ListNode,Integer>();
        ListNode dummy = head;
        int a=0;
        while(dummy != null){
            if(hm.containsKey(dummy)){
                return dummy;
            }else{
                hm.put(dummy,a);
                a++;
            }
        }
        return null;
    }
}
