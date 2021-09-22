package code;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @Author biubiu
 * @Date 2021/9/12 9:58
 */
public class DistaceCar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] spread=new int[n];
        for(int i=0;i<n;i++){
            spread[i]= sc.nextInt();
        }
        Arrays.sort(spread);
        int maxTime =(int) Math.ceil(k / (spread[n - 1] / 3.6 + m / 3.6));
        System.out.println(maxTime);
        int minTime =(int) Math.ceil(k/(spread[0]/3.6+m/3.6));
        System.out.println(minTime);

    }

    public int solve (String s) {
        // write code here
        char[] chars=s.toCharArray();
        Stack<Character> stack =new Stack<Character>();
        Stack<Integer> temp =new Stack<Integer>();
        for(int i=0;i<chars.length;i++){
            if(Character.isDigit(chars[i])){
                stack.push(chars[i]);
            }else if(chars[i] == '('){
                stack.push(chars[i]);
            }else if (chars[i]=='+'){
                stack.push(chars[i]);
            }else if(chars[i]==')'){
                while (stack.peek()!='('){
                    if (Character.isDigit(stack.peek())) {
                        temp.push(Integer.valueOf(stack.pop()));
                    }
                    if(stack.pop() == '+'){
                        int a= Integer.valueOf(stack.pop())+temp.pop();
                        temp.push(a);
                    }else if(stack.pop() == '-'){
                        temp.push((Integer.valueOf(stack.pop())-temp.pop()));
                    }else if(stack.pop()=='*'){
                        temp.push((Integer.valueOf(stack.pop())*temp.pop()));
                    }
                }
                stack.pop();
                int a =temp.pop();
                stack.push((char)a);
            }
        }
        while(!stack.isEmpty()){
            return stack.pop();
        }
        return 0;
    }
}
