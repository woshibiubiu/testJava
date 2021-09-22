package code;

/**
 * @Author biubiu
 * @Date 2021/9/1 15:00
 */
public class Dcl {
    private static volatile Dcl dcl;

    private Dcl() {
    }

    public static Dcl getInstance(){
        if (dcl == null){
            synchronized (dcl){
                if(dcl == null){
                    dcl =new Dcl();
                }
            }
        }
        return dcl;
    }
}