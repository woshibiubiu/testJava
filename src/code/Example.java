package code;

import java.nio.file.Watchable;

/**
 * @Author biubiu
 * @Date 2021/9/16 12:34
 */
public class Example {
    String str =new String("good");
    char ch[]={'a','b','c'};

    public void change(String str,char ch[]){
        str = str.substring(0,2);
        ch[0]='g';
    }

    public static void main(String[] args) {
        Example ex=new Example();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str+"and"+new String(ex.ch));
    }
}
