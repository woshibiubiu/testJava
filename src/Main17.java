import java.util.HashMap;

/**
 * @date 2021/4/24 19:43
 */
public class Main17 {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        HashMap hm = new HashMap();
        int a = 0;int m=0;
        if(s.equals("")) return 0;
        if(s.equals(" ")) return 1;
        char[] chars = s.toCharArray();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (!hm.containsKey(chars[i])) {
                a++;
                hm.put(chars[i],a);
                m=Math.max(a,m);
            }else {
                int b = (int) hm.get(chars[i]);
                hm.put(chars[i],a-b);
                a=a-b;
            }

        }
        return a;
    }
}