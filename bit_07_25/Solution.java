package bit_07_25;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/7/25
 * Time:0:44
 */
public class Solution {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Map<String, Integer> map=new LinkedHashMap<String,Integer>();
            while(sc.hasNext()){
                String str=sc.next();
                int linenum=sc.nextInt();
                String[] arr=str.split("\\\\");  //根据\切割
                String s=arr[arr.length-1];
                if(s.length()>16)  //截取
                    s=s.substring(s.length()-16);
                String key=s+" "+linenum;
                int value=1;
                if(map.containsKey(key))
                    map.put(key, map.get(key)+1);
                else {
                    map.put(key, value);
                }
            }
            int count=0;
            for(String string:map.keySet()){
                count++;
                if(count>(map.keySet().size()-8)) //输出最后八个记录
                    System.out.println(string+" "+map.get(string));
            }
        }
    }
