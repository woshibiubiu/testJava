package code;

import javax.swing.tree.TreeNode;
import java.util.*;

/**
 * @Author biubiu
 * @Date 2021/9/13 16:47
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] chars = s.toCharArray();
        int a=sc.nextInt();
        int len =s.length()-a;
        int length =len;
        int len2=len;
        int len3=len;
        int min=Integer.MAX_VALUE;
        int temp=0;
        int[] mine=new int[len];
        while(len2-->0){
            for(int i=len-1;i<len;i++){
                if(chars[i]=='.'){
                    continue;
                }
                if(min>Integer.valueOf(chars[i])){
                    min =Math.min(min,Integer.valueOf(chars[i]));
                    temp =i;
                }
            }
            int ans =temp;
            if(s.length()-temp==len){
                for(int j=length-len;j<len;j++,ans++){
                    mine[j]=Integer.valueOf(chars[ans]);
                }
            }
            if(s.length()-temp<len){
                continue;
            }else{
                len--;
                chars[temp]='.';
                mine[length-len]=min;
            }
        }
        int nums =0;
        for(int k=0;a<len3;k++){
            nums+=mine[k]*10;
        }

        System.out.println(nums);

    }
    public ListNode[] listOfDepth(TreeNode tree) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> lists= new ArrayList<>();
        if(tree != null){
            queue.add(tree);
        }
        while(!queue.isEmpty()){
            List<Integer> list =new ArrayList<>();
            for(int i=queue.size();i>0;i--){
                TreeNode temp=queue.poll();
                list.add(temp.val);
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            lists.add(list);
        }
        ListNode[] a=new ListNode[lists.size()];

        for(int i=0;i<lists.size();i++){
            ListNode l = new ListNode(0);
            ListNode l1=l;
            for(int j=0;j<lists.get(i).size();j++){
                ListNode temp =new ListNode(lists.get(i).get(j));

                l.next=temp;
                l=l.next;
            }
            a[i]=l1.next;
        }
        return a;
    }

      public class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
