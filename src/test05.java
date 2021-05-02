import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @date 2021/3/13 16:36
 */
public class test05 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        List list =new ArrayList();
        Scanner scanner=new Scanner(System.in);
        String s = scanner.nextLine();
        int ss=s.charAt(0);
        sb.append(ss);
        list.add(sb);
        System.out.println(list);
    }
}
