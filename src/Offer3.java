/**
 * @date 2021/4/28 12:50
 */
public class Offer3 {
    public static void main(String[] args) {


    }
    public String replaceSpace(String s) {
        int len =s.length();
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<len ;i++){
            if(s.charAt(i) ==' '){
                stringBuilder.append("%20");
            }else{
                stringBuilder.append(s.charAt(i));

            }
        }
        String s1 = stringBuilder.toString();
        return s1;
    }
}
