import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @date 2021/4/1 15:16
 */
public class Main9 {


    public static void main(String[] args) {
        List<List<String>> res =new ArrayList<>();
        List<String> ans =new ArrayList<>();
        List<String> arr=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            String ss = sc.next();
            arr.add(ss);
        }
        dfs(res,ans,arr);
        System.out.println(res);
        for(int i=0;i<res.size();i++){
            //if(res.get(i).get(0) == "B") continue;
            for(int j=0;j<res.get(0).size();j++){

                System.out.print(res.get(i).get(j));
                if(res.get(i).get(j) == res.get(i).get(a-1)){
                    System.out.print("  ");
                    continue;
                }
                System.out.print("-");
            }
            System.out.print(" ");
        }
        System.out.println(a);
    }

    public static void dfs(List<List<String>> res,List<String> ans,List<String> arr){
        if(ans.size() == arr.size()) {
            res.add(new ArrayList<>(ans));
            return;
        }
        for(String arrs:arr){
            if(ans.contains(arrs) ||(ans.contains("B") &&arrs.equals("A") )) {

                continue;
            }

            ans.add(arrs);
            dfs(res,ans,arr);
            ans.remove(ans.size()-1);
        }
    }

}
