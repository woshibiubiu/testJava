package code;

import java.util.*;

/**
 * @Author biubiu
 * @Date 2021/9/1 17:05
 */
public class TestHashMapCollections {


    //    public static void main(String[] args) {
//        Map<String,Integer> hm =new HashMap<String,Integer>();
//        hm.put("王二", 8);
//        hm.put("沈吴", 2);
//        hm.put("小菜", 3);
//        hm.put("大鸟", 1);
//        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
//        for(Map.Entry s:entries){
//            System.out.println(s.getKey()+"--"+s.getValue());
//        }
//        List<Map.Entry<String, Integer>> list =new ArrayList<Map.Entry<String, Integer>>(hm.entrySet());
//        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
//        {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
//            {
//                //按照value值，重小到大排序
////                return o1.getValue() - o2.getValue();
//
//                //按照value值，从大到小排序
////                return o2.getValue() - o1.getValue();
//
//                //按照value值，用compareTo()方法默认是从小到大排序
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put(new String("129"), 8);
        map.put(new String("129"), 2);
        map.put("2", 3);
        map.put("1", 1);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry s : entrySet) {
            System.out.println(s.getKey() + "--" + s.getValue());
        }

        System.out.println("============排序后============");

        //////借助list实现hashMap排序//////

        //注意 ArrayList<>() 括号里要传入map.entrySet()
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                //按照value值，重小到大排序
//                return o1.getValue() - o2.getValue();

                //按照value值，从大到小排序
//                return o2.getValue() - o1.getValue();

                //按照value值，用compareTo()方法默认是从小到大排序
                if(o1.getKey()==o2.getKey()){
                   return o1.getKey().compareTo(o2.getKey());
                }else{
                     return o1.getValue() - o2.getValue();

                }

            }
        });

        //注意这里遍历的是list，也就是我们将map.Entry放进了list，排序后的集合
        for (Map.Entry s : list) {
            System.out.println(s.getKey() + "--" + s.getValue());
        }
    }
}
