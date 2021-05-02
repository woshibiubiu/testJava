import java.util.Stack;

/**
 * @date 2021/4/28 19:56
 */
public class Offer06 {
    public static void main(String[] args) {

    }
    class Solution {
        public int[] reversePrint(ListNode head) {
            Stack<ListNode> stack = new Stack<ListNode>();
            ListNode temp = head;
            while (temp != null) {
                stack.push(temp);
                temp = temp.next;
            }
            int size = stack.size();
            int[] print = new int[size];
            for (int i = 0; i < size; i++) {
                print[i] = stack.pop().val;
            }
            return print;
        }
    }

}
